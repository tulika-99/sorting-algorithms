#include<stdlib.h> 
#include<stdio.h> 

/*
 * Merges two subarrays of arr[]. 
 * The first subarray is arr[l..m] and the second subarray is arr[m+1..r].
*/
void merge(int arr[], int l, int m, int r){ 
	int i, j, k; 
	int n1 = m - l + 1; 
	int n2 = r - m; 
	int lArr[n1], rArr[n2]; 

	for (i = 0; i < n1; i++) 
		lArr[i] = arr[l + i]; 

	for (j = 0; j < n2; j++) 
		rArr[j] = arr[m + 1+ j]; 

	/* Merge the temp arrays*/
	i = 0; 
	j = 0; 
	k = l; 

	while (i < n1 && j < n2){ 

		if (lArr[i] <= rArr[j]){ 
			arr[k] = lArr[i]; 
			i++; 
		} 
		else{ 
			arr[k] = rArr[j]; 
			j++; 
		} 
		k++; 
	} 

	/* Copy the remaining elements of lArr[]*/
	while (i < n1){ 
		arr[k] = lArr[i]; 
		i++; 
		k++; 
	} 

	/* Copy the remaining elements of rArr[]*/
	while (j < n2){ 
		arr[k] = rArr[j]; 
		j++; 
		k++; 
	} 
} 


void mergeSort(int arr[], int l, int r){ 
	if (l < r){ 

		int m = l+(r-l)/2; 

		mergeSort(arr, l, m); 
		mergeSort(arr, m+1, r); 

		merge(arr, l, m, r); 
	} 
} 


/* Utility function to print an array */
void printArray(int a[], int size){ 
	int i; 
	for (i=0; i < size; i++) 
		printf("%d ", a[i]); 
	printf("\n"); 
} 

int main(){ 
	int arr[] = {12, 11, 13, 5, 6, 7}; 
	int arr_size = sizeof(arr)/sizeof(arr[0]); 

	printf("The initial array is \n"); 
	printArray(arr, arr_size); 

	mergeSort(arr, 0, arr_size - 1); 

	printf("\nSorted array is \n"); 
	printArray(arr, arr_size); 
	return 0; 
} 
