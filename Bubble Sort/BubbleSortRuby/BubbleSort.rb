#!/usr/bin/ruby
def bubble_sort(array)
   n = array.length
   swapped = true
   while swapped do
     swapped = false
     (n - 1).times do |i|
       if array[i] > array[i + 1]
         array[i], array[i + 1] = array[i + 1], array[i]
     swapped = true
       end
     end
   end
   array 
end

arr = [5,1,102,65,12,42,103,17]

puts arr
puts "Sorted"
puts bubble_sort(arr)
