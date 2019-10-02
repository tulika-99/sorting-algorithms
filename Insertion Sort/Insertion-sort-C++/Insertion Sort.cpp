#include <iostream>
#include <limits.h>
#include <conio.h>
#include <stdio.h>

using namespace std;

void insertionsort(int [],int);
void display(int a[], int n);

int main()
{
	int a[50],i,n;
	cout<<"\t\t\t\t\t\t ***INSERTION SORT***"<<endl;
	cout<<"\n\t Number of Elements:-";
	cin>>n;
	cout<<"\t Enter Elements:-"<<endl;
	for(int i=0;i<n;i++)
	{
		printf("\t %d.",i+1);
		cin>>a[i];
	}
	insertionsort(a,n);
	cout<<"\n\t Sorted Array: -";
	for(int i=0;i<n;i++)
		printf("\n\t %d. %d",i+1,a[i]);
	getch();
	return 0;
}
void insertionsort(int a[],int n)
{
	int temp,i,j;
	for(i=1;i<n;i++)
	{
		temp=a[i];
		j=i-1;
		while(temp<a[j] && j>=0)
		{
			a[j+1]=a[j];
			j--;
			display(a,n);
		}
		a[j+1]=temp;
		display(a,n);
	}
}

void display(int a[], int n)
{
	for(int i=0;i<n;i++)
		cout<<a[i]<<" ";
	cout<<endl;
}
