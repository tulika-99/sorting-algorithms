#include<stdio.h>
#include<conio.h>

//swap function to swap values
void swap(int *n,int *p)
{
    int temp=*n;
    *n=*p;
    *p=temp;
}
// To heapify a subtree rooted with node i which is
// an index in arr[]. n is size of heap
void heapify(int a[],int n,int i)
{
    int lar_ind=i;
    int l=2*i+1;
    int r=2*i+2;
    // If left child is larger than root
    if(l<n && a[l]>a[lar_ind])
    {
        lar_ind=l;
    }
    // If right child is larger than largest so far
    if(r<n && a[r]>a[lar_ind])
    {
        lar_ind=r;
    }
    // If largest is not root
    if(lar_ind!=i)
    {
        swap(&a[i],&a[lar_ind]);
        // Recursively heapify the affected sub-tree
        heapify(a,n,lar_ind);
    }
}
void heapsort(int a[],int n)
{
    // Build heap (rearrange array)
    for(int i=n/2-1;i>=0;i--)
    {
        heapify(a,n,i);
    }
    // One by one extract an element from heap
    for(int i=n-1;i>0;i--)
    {
        // Move current root to end
        swap(&a[0],&a[i]);
        // call max heapify on the reduced heap
        heapify(a,i,0);
    }
}
// Driver program
void main()
{
    int n;
    printf("enter NO. of elements");
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    heapsort(arr,n);
    printf("sorted array by heapsort is");
    for(int i=0;i<n;i++)
    {
        printf("%d\n",arr[i]);
    }


}
