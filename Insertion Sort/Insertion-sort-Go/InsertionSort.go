package main

import "fmt"

// custom type array
type MyArray []int64

func (arr MyArray) InsertionSort() {
	n := len(arr)
	for i := 1; i < n; i++ {
		key, j := arr[i], i-1
		for j >= 0 && arr[j] > key {
			arr[j+1] = arr[j]
			j--
		}
		arr[j+1] = key

	}
}

func main() {
	arr := MyArray{12, 11, 13, 5, 6}
	fmt.Printf("Before sort: %v\n", arr) //Before sort: [12 11 13 5 6]
	arr.InsertionSort()
	fmt.Printf("After sort: %v\n", arr) //After sort: [5 6 11 12 13]
}
