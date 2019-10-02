package main

import "fmt"

// custom type array
type MyArray []int64

func (arr MyArray) MergeSort() {
	arr.sort(0, len(arr)-1)
}

func (arr MyArray) sort(left, right int) {
	if left < right {
		var mid int = (left + right) / 2
		arr.sort(left, mid)
		arr.sort(mid+1, right)
		arr.merge(left, mid, right)
	}
}

func (arr MyArray) merge(left, mid, right int) {
	n1, n2 := mid-left+1, right-mid
	lefts := make([]int64, n1)
	rights := make([]int64, n2)
	for i := 0; i < n1; i++ {
		lefts[i] = arr[left+i]
	}
	for j := 0; j < n2; j++ {
		rights[j] = arr[mid+1+j]
	}

	i, j, k := 0, 0, left
	for i < n1 && j < n2 {
		if lefts[i] <= rights[j] {
			arr[k] = lefts[i]
			i++
		} else {
			arr[k] = rights[j]
			j++
		}
		k++
	}

	for i < n1 {
		arr[k] = lefts[i]
		i++
		k++
	}

	for j < n2 {
		arr[k] = rights[j]
		j++
		k++
	}
}

func main() {
	arr := MyArray{90, 30, 5, 3, 15, 1, 2}
	fmt.Printf("Before sort: %v\n", arr) //Before sort: [90 30 5 3 15 1 2]
	arr.MergeSort()
	fmt.Printf("After sort: %v\n", arr) //After sort: [1 2 3 5 15 30 90]
}
