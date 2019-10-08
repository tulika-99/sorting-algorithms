package main

import "fmt"

func main() {
	fmt.Println("test")
	s := []int{7, 2, 3, 4, 4}
	fmt.Println(selectionSort(s))
}

func selectionSort(numbers []int) []int {
	n := len(numbers)
	for i := 0; i < n; i++ {
		minIndex := i
		for j := i; j < n; j++ {
			if numbers[j] < numbers[minIndex] {
				minIndex = j
			}
		}
		numbers[i], numbers[minIndex] = numbers[minIndex], numbers[i]
	}
	return numbers
}
