import (
	"fmt"
	"strconv"
)

func largest(arr []int) int {
	max := 0

	for i := 0; i < len(arr); i++ {
		if arr[i] > max {
			max = arr[i]
		}
	}
	return max
}

func radixSort(arr []int) []int {

	// base 10
	max := largest(arr)
	size := len(arr)
	significantDigit := 1
	partial := make([]int, size, size)

	for max / significantDigit > 0 {

		bucket := [10]int{0}

		for i := 0; i < size; i++ {
			bucket[(arr[i] / significantDigit) % 10]++
		}

		for i := 1; i < 10; i++ {
			bucket[i] += bucket[i - 1] 
		}

		for i := size - 1; i >= 0; i-- {
			bucket[(arr[i] / significantDigit) % 10]--
			partial[bucket[(arr[i] / significantDigit) % 10]] = arr[i]
		}

		for i := 0; i < size; i++ {
			arr[i] = partial[i]
		}
  
		significantDigit *= 10 
	}

	return arr
}

func main() {

	unsorted :=[]int{9386, 234, 369, 4863, 611, 1, 0, 55, 69, 928, 2267, 28}
	fmt.Println("Unsorted:", unsorted, "\n")

	sorted := radixSort(unsorted)
	fmt.Println("\nSorted:", sorted, "\n")
}