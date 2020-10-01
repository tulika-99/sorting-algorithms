package bricksort

// A function to sort the algorithm using Odd Even sort
func oddEvenSort(arr []int, n int) {
	isSorted := false

	// Bubble sort on odd element
	for !isSorted {
		isSorted = false
		for i := 1; i <= n-2; i = i + 2 {
			if arr[i] > arr[i+1] {
				arr[i], arr[i+1] = arr[i+1], arr[i] // Swaps elements
				isSorted = false
			}
		}

		// Bubble sort on even element
		for i := 0; i <= n-2; i = i + 2 {
			if arr[i] > arr[i+1] {
				arr[i], arr[i+1] = arr[i+1], arr[i] // Swaps elements
				isSorted = false
			}
		}
	}

}
