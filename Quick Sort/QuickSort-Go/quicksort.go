// Quick Sort in Golang
package main
 
import (
    "fmt"
    "math/rand"
    "time"
)
 
func main() {
 
    slice := generateRandomSlice(20)
    fmt.Println("\nUnsorted Randomly Generated Values \n\n", slice)
    quicksort(slice)
    fmt.Println("\nSorted version of the Above List\n\n", slice, "\n")
}
 
// Generates a slice of size, size filled with randomly generated numbers
func generateRandomSlice(size int) []int {
 
    slice := make([]int, size, size)
    rand.Seed(time.Now().UnixNano())
    for i := 0; i < size; i++ {
        slice[i] = rand.Intn(999) - rand.Intn(999)
    }
    return slice
}

//Implementation of the Sorting Algorithm  
func quicksort(a []int) []int {
    if len(a) < 2 {
        return a
    }
      
    left, right := 0, len(a)-1
      
    pivot := rand.Int() % len(a)
      
    a[pivot], a[right] = a[right], a[pivot]
      
    for i, _ := range a {
        if a[i] < a[right] {
            a[left], a[i] = a[i], a[left]
            left++
        }
    }
      
    a[left], a[right] = a[right], a[left]
      
    quicksort(a[:left])
    quicksort(a[left+1:])
      
    return a
}