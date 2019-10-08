import Foundation

let array = [10, 22, 50, 9, 33, 41, 21, 40, 80, 60, 26]
print("original array \(array)")
var result = array
   var didSwap = false
   for var i in 0..<array.count-1{
       for j in 0..<array.count-i-1{
           if(result[j] > result[j+1]){
               let temp = result[j]
               result[j] = result[j+1]
               result[j+1] = temp
           }
       }
   }
   print("sorted array ",result)