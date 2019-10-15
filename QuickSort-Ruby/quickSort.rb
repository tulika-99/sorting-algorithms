def partition(op,list)
  list.select { |n| n.send(op,list.first)}
end

def quick_sort(list)
  return [] if list.empty?

  quick_sort(partition(:<, list)) + [list.first] * list.count(list.first) + quick_sort(partition(:>, list))
end

a = [3,7,2,1,7,8,12]

p quick_sort(a)
