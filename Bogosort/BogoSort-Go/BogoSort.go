package main

import (
	"fmt"
	"math/rand"
)

// custom type array
type MyArray []int64

func (arr MyArray) BogoSort() {
	for !arr.isSorted() {
		for i := 0; i < len(arr); i++ {
			randomIndex := rand.Intn(len(arr))
			arr[i], arr[randomIndex] = arr[randomIndex], arr[i]
		}
	}
}

func (arr MyArray) isSorted() bool {
	for i := 0; i < len(arr)-1; i++ {
		if arr[i] > arr[i+1] {
			return false
		}
	}
	return true
}

func main() {
	arr := MyArray{3, 1, 2}
	fmt.Printf("Before sort: %v\n", arr) //Before sort: [3 1 2]
	arr.BogoSort()
	fmt.Printf("After sort: %v\n", arr) //After sort: [1 2 3]
}
