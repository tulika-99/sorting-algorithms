//A C++ program to sort integers in ascending order using TimSort algorithm

#include<iostream>
using namespace std;

const int s=32;

// This function sorts array from which is of size s
void insertionSort(int arr[], int l, int r){
    for (int i=l+1;i<=r;i++){
        int temp=arr[i];
        int j=i-1;
        while(j>=l && arr[j]>temp){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;
    }
}

// Merge function to merge the sorted runs
void mergeArray(int arr[], int l, int m, int r){
    int len1=m-l+1, len2=r-m;
    int left[len1], right[len2];
    for(int i=0;i<len1;i++)
        left[i]=arr[l+i];
    for(int i=0;i<len2;i++)
        right[i]=arr[m+1+i];

    int i=0, j=0, k=l;
    while(i<len1 && j<len2){
        if(left[i]<=right[j]){
            arr[k]=left[i];
            i++;
        }
        else{
            arr[k]=right[j];
            j++;
        }
        k++;
    }

    while(i<len1){
        arr[k]=left[i];
        k++;
        i++;
    }

    while(j<len2){
        arr[k]=right[j];
        k++;
        j++;
    }
}

// Timsort function to sort the array[0...n-1]
void timSort(int arr[], int n){
    // Sorting individual subarrays of size s
    for (int i=0;i<n;i+=s)
        insertionSort(arr, i, min((i+s-1),(n-1)));
    
    // Merging the arrays from size RUN
    for (int size=s;size<n;size=2*size){
        for (int l=0;l<n;l+=2*size){
            int mid=l+size-1;
            int r=min((l+2*size-1),(n-1));
            if(mid<r)
                mergeArray(arr, l, mid, r);
        }
    }
}

// Utility function to print the elements of the array
void printArray(int arr[], int n){
    for (int i=0;i<n;i++)
        cout<<arr[i]<<" ";
    cout<<endl;
}

// Main method to test the algorithm
int main(){
    int n;
    cout<<"Enter number of elements in array=";
    cin>>n;
    int arr[n];
    cout<<"Enter array=";
    for(int i=0;i<n;i++)
        cin>>arr[i];
    timSort(arr, n);
    cout<<"Sorted Array is:"<<endl;
    printArray(arr,n);
    return 0;
}
