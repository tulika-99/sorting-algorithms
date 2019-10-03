// C++ program for implementation of selection sort  
#include <bits/stdc++.h> 
using namespace std; 
  
void selectionSort(int arr[], int n)  		//Function for selection sort
{  
    int min,temp;   
    for (int i = 0; i < n-1; i++)  
    {  
        min = i;  
        for (int j = i+1; j < n; j++)  
        if (arr[j] < arr[min])  
            min = j;  
  
       	temp=arr[min];						//Swapping the value
       	arr[min]=arr[i];
       	arr[i]=temp;
    }  
}  
void printArray(int arr[], int size)  //Function to print array
{  
    int i;  
    for (i=0; i < size; i++)  
        cout << arr[i] << " ";  
    cout << endl;  
}    
int main()  
{  
    int arr[100],n;
	cout<<"\nEnter the number of elements:- ";
	cin>>n;
	cout<<"\nEnter the elements:- ";
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
	}
    selectionSort(arr, n);  
    cout << "\nSorted array: \n";  
    printArray(arr, n);  
    return 0;  
}  
