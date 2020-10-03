// Radix sort C implementation
#include<stdio.h>
#include<conio.h>
// The main function to that sorts arr[] of size n using Radix Sort
void radix(int a[],int n)
{

    int max=a[0];
    for(int i=1;i<n;i++)
    {
        if(max<a[i])
        {
            max=a[i];
        }
    }
    // Do counting sort for every digit. Note that instead
    // of passing digit number, exp is passed. exp is 10^i
    // where i is current digit number
    for(int i=1;max/i>0;i*=10)
    {
        count(a,n,i);
    }
}
// does counting sort
void count(int a[],int n,int p)
{
    int max=a[0];
    for(int i=1;i<n;i++)
    {
        if(max<a[i])
        {
            max=a[i];
        }
    }
    int b[max+1];
    for(int i=0;i<max+1;i++)
    {
        b[i]=0;
    }
    for(int i=0;i<n;i++)
    {
        b[(a[i]/p)%10]+=1;
    }
    for(int i=1;i<max+1;i++)
    {
       b[i]+=b[i-1];
    }
    int c[n];
    for(int i=0;i<n;i++)
    {
        c[i]=0;
    }
    for(int i=0;i<n;i++)
    {
        c[b[(a[i]/p)%10]-1]=a[i];
        b[(a[i]/p)%10]-=1;
    }
    for(int i=0;i<n;i++)
    {
        a[i]=c[i];
    }
}
/*Driver function to check for above function*/
void main()
{
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    radix(arr,n);
    for(int i=0;i<n;i++)
    {
        printf("%d\n",arr[i]);
    }


}
