 
/* C++ program for Odd Even Sort */
#include <bits/stdc++.h>
using namespace std;

void swap(int *xp, int *yp)
{
    int temp = *xp;
    *xp = *yp;
    *yp = temp;
}

void oddEvenSort(int arr[], int n)
{
    bool sorted = false;
    while(!sorted) {
        sorted = true;
	// bubble sort on odd indexed element
        for(int i = 1; i < n-1; i += 2){
            if(arr[i] > arr[i+1]) {
                swap(&arr[i], &arr[i+1]);
                sorted = false;
            }
        }
	// bubble sort on even indexed element
        for(int i = 0; i < n-1; i += 2){
            if(arr[i] > arr[i+1]) {
                swap(&arr[i], &arr[i+1]);
                sorted = false;
            }
        }
    }
}

/* UTILITY FUNCTIONS */
/* Function to print an array */

void printArray(int arr[], int size)
{
    int i;
    for (i=0; i < size; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

/* Driver program to test above functions */

int main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
        cin>>arr[i];
    oddEvenSort(arr, n);
    printf("Sorted array: \n");
    printArray(arr, n);
    return 0;
}
