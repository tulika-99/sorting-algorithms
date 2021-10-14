vector<int> topological_sorting(vector<vector<int>> graph)
{
    vector<int> indegree(graph.size(), 0);
    queue<int> q;
    vector<int> solution;

    for (int i = 0; i < graph.size(); i++)
    {
        for (int j = 0; j < graph[i].size(); j++)
        {
            //iterate over all edges
            indegree[graph[i][j]]++;
        }
    }

    //enqueue all nodes with indegree 0
    for (int i = 0; i < graph.size(); i++)
    {
        if (indegree[i] == 0)
        {
            q.push(i);
        }
    }

    //remove one node after the other
    while (q.size() > 0)
    {
        int currentNode = q.front();
        q.pop();
        solution.push_back(currentNode);
        for (int j = 0; j < graph[currentNode].size(); j++)
        {
            //remove all edges
            int newNode = graph[currentNode][j];
            indegree[newNode]--;
            if (indegree[newNode] == 0)
            {
                //target node has now no more incoming edges
                q.push(newNode);
            }
        }
    }

    return solution;
}
int main()
{

    int n, v1, v2;
    cin >> n;
    vector<vector<int>> graph;
    for (int i = 1; i <= n; i++)
    {
        cin >> v1 >> v2;
        g.addEdge(v1, v2);
    }

    cout << " Topological Sort of the given graph \n";
    g.topologicalSort();

    return 0;
}