/*

* C Program to Implement brick Sort

*/

#include <stdio.h>

void swap(int *,int *);
void oddeven_sort(int *,int n);

void main()
{
    int i, n;
    printf("enter the No. of element  you want to sort");
    scanf("%d", &n);
    int a[n];
    printf("enter the elements in to the matrix :");
    for (i = 0;i < n;i++)
    {
        scanf("%d", &a[i]);
    }
    printf("sorted elements are :\n");
    oddeven_sort(a,n);
    for (i = 0;i < n;i++)
    {
        printf(" %d", a[i]);
    }
}

/* swaps the elements */
void swap(int * x, int * y)
{
    int temp;
    temp = *x;
    *x = *y;
    *y = temp;

}

/* sorts the array using oddeven algorithm */
void oddeven_sort(int * x,int n)
{
    int sort = 0, i;
    while (!sort)
    {
        sort = 1;
        for (i = 1;i < n;i += 2)
        {
            if (x[i] > x[i+1])
            {
                swap(&x[i], &x[i+1]);
                sort = 0;
            }
        }
        for (i = 0;i < n - 1;i += 2)
        {
            if (x[i] > x[i + 1])
            {
                swap(&x[i], &x[i + 1]);
                sort = 0;
            }
        }
    }
}
