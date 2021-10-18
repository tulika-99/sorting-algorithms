#include <bits/stdc++.h>
using namespace std;

// Function to swap two numbers.
void swap(int *x, int *y)
{
	int temp = *x;
	*x = *y;
	*y = temp;
}

void wiggles(int arr[], int n)
{
	sort(arr, arr+n);
	for (int i=0; i<n-1; i += 2)
		swap(&arr[i], &arr[i+1]);
}
int main()
{
    int n;
    cout << "Enter number of elements to sort using Wiggle Sort:";
    cin >> n;
	int arr[n] ;
    cout << "Enter Elements:";
    for(int i=0;i<n;i++)
    cin>>arr[i];
	wiggles(arr, n);
	cout << "Wiggled Output::";
	for (int i=0; i<n; i++)
	cout << arr[i] << " ";
	return 0;
}
