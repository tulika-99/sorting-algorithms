# Python implementation of Introsort algorithm

import math
import sys
from heapq import heappush, heappop

arr = []


# The main function to sort
# an array of the given size
# using heapsort algorithm

def heapsort():
	global arr
	h = []

	# building the heap

	for value in arr:
		heappush(h, value)
	arr = []

	# extracting the sorted elements one by one

	arr = arr + [heappop(h) for i in range(len(h))]


# The main function to sort the data using
# insertion sort algorithm

def InsertionSort(begin, end):
	left = begin
	right = end

	# Traverse through 1 to len(arr)

	for i in range(left + 1, right + 1):
		key = arr[i]

		# Move elements of arr[0..i-1], that are
		# greater than key, to one position ahead
		# of their current position

		j = i - 1
		while j >= left and arr[j] > key:
			arr[j + 1] = arr[j]
			j = j - 1
		arr[j + 1] = key


# This function takes last element as pivot, places
# the pivot element at its correct position in sorted
# array, and places all smaller (smaller than pivot)
# to left of pivot and all greater elements to right
# of pivot

def Partition(low, high):
	global arr

# pivot

	pivot = arr[high]

# index of smaller element

	i = low - 1

	for j in range(low, high):

		# If the current element is smaller than or
		# equal to the pivot

		if arr[j] <= pivot:

			# increment index of smaller element

			i = i + 1
			(arr[i], arr[j]) = (arr[j], arr[i])
	(arr[i + 1], arr[high]) = (arr[high], arr[i + 1])
	return i + 1


# The function to find the median
# of the three elements in
# in the index a, b, d

def MedianOfThree(a, b, d):
	global arr
	A = arr[a]
	B = arr[b]
	C = arr[d]

	if A <= B and B <= C:
		return b
	if C <= B and B <= A:
		return b
	if B <= A and A <= C:
		return a
	if C <= A and A <= B:
		return a
	if B <= C and C <= A:
		return d
	if A <= C and C <= B:
		return d


# The main function that implements Introsort
# low --> Starting index,
# high --> Ending index
# depthLimit --> recursion level

def IntrosortUtil(begin, end, depthLimit):
	global arr
	size = end - begin
	if size < 16:

		# if the data set is small, call insertion sort

		InsertionSort(begin, end)
		return

	if depthLimit == 0:

		# if the recursion limit is occurred call heap sort

		heapsort()
		return

	pivot = MedianOfThree(begin, begin + size // 2, end)
	(arr[pivot], arr[end]) = (arr[end], arr[pivot])

	# partitionPoint is partitioning index,
	# arr[partitionPoint] is now at right place

	partitionPoint = Partition(begin, end)

	# Separately sort elements before partition and after partition

	IntrosortUtil(begin, partitionPoint - 1, depthLimit - 1)
	IntrosortUtil(partitionPoint + 1, end, depthLimit - 1)


# A utility function to begin the Introsort module

def Introsort(begin, end):

	# initialise the depthLimit as 2 * log(length(data))

	depthLimit = 2 * math.floor(math.log2(end - begin))
	IntrosortUtil(begin, end, depthLimit)


# A utility function to print the array data

def printArr():
	print ('Arr: ', arr)


def main():
	global arr
	arr = arr + [
		2, 10, 24, 2, 10, 11, 27,
		4, 2, 4, 28, 16, 9, 8,
		28, 10, 13, 24, 22, 28,
		0, 13, 27, 13, 3, 23,
		18, 22, 8, 8 ]
		
	n = len(arr)

	Introsort(0, n - 1)
	printArr()


if __name__ == '__main__':
	main()
