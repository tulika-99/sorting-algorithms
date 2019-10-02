#include<iostream>
using namespace std;
void BubbleSort(int arr[],int n)	//Function for Bubble Sorting
{
	int temp;
		for(int k=0;k<n-1;k++)
	{
		for(int j=0;j<n-1;j++)
		{
				if(arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			else
			{
				continue;
			}
		}
	}
}
int main()
{
	int n,a[30],temp;
	cout<<"\nEnter the number of elements= ";
	cin>>n;
	cout<<"\nEnter the elements= ";
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
	}
	BubbleSort(a,n);
	cout<<"\nThe sorted elements= "<<endl;
	for(int i=0;i<n;i++)
	{
		cout<<a[i]<<endl;
	}
	return 0;
}
