package main

import "fmt"

// custom type array
type MyArray []int64

// mutate the array
func (arr MyArray) BubbleSort() {
	n := len(arr)
	for i := 0; i < n-1; i++ {
		for j := 0; j < n-i-1; j++ {
			if arr[j] > arr[j+1] {
				arr[j], arr[j+1] = arr[j+1], arr[j]
			}
		}
	}
}

func main() {
	arr := MyArray{64, 34, 25, 12, 22, 11, 90}
	fmt.Printf("Before sort: %v\n", arr) //Before sort: [64 34 25 12 22 11 90]
	arr.BubbleSort()
	fmt.Printf("After sort: %v\n", arr) //After sort: [11 12 22 25 34 64 90]
}
