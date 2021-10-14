public class Vertex
{
public int val;
public boolean visiting,visited;
public List childNodes;
}

// returns null if no topological sort is possible
public List
topological_sort_by_dfs(List<Vertex> graph)
{
    Stack stack = new Stack();
    List<Vertex> result = new ArrayList<>();
    for (Vertex vertex : graph)
    {
        if (!vertex.visited)
        {
            boolean dfs_result = dfs(vertex, stack);
            // if cycle found then there is no topological sort possible
            if (!dfs_result)
            {
                return null;
            }
        }
    }
    for (Vertex vertex : stack)
    {
        result.add(stack.pop());
    }
    return result
}

private
boolean dfs(Vertex vertex, Stack<Vertex> stack)
{
    vertex.visiting = true;
    for (Vertex childNode : vertex.childNodes)
    {
        if (!childNode.visited)
        {
            // check for back-edge, i.e., cycle
            if (childNode.visiting)
            {
                return false;
            }
            boolean childResult = dfs(childNode, stack);
            if (!childResult)
            {
                return false;
            }
        }
    }

    // now that you have completely visited all the
    // childNodes of the vertex, push the vertex in the stack
    stack.push(vertex);
    vertex.visited = true;
    vertex.visiting = false;
    return true;
}