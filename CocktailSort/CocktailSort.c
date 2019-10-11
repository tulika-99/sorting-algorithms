/******************************************************************************
                                COCKTAIL SORT
*******************************************************************************/

#include <stdio.h>

int main(void) 
{
    int i, j, start=0, n, end, flag;
    printf ("Enter value of n: ");
    scanf ("%d", &n);
    int a[n];
    printf ("Please enter %d values\n",n);
    for(i=0; i<n; i++)
    {
        scanf("%d", &a[i]);
    }
    flag = 0;
    end = n;
    while(start <= end)
    {
        for(i=start; i<end-1; i++)
        {
            if(a[i]>a[i+1])
            {
                int temp =a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                flag=1;
            }
        }
        if(flag==0)
        {
            break;
        }
        flag=0;
        end = end-1;
        for(i=end; i>start-1; i--)
        {
            if(a[i]<a[i-1])
            {
                int temp = a[i];
                a[i] = a[i-1];
                a[i-1]= temp;
                flag=1;
            }
        }
        if(flag==0)
        {
            break;
        }
        start = start+1;
        flag=0;
    }
    for(i=0; i<n; i++)
    {
        printf("%d ", a[i] );
    }
    return 0;
}


/******************************************************************************
                                  COMPLEXITY
Worst and Average Case Time Complexity: O(n*n).
Best Case Time Complexity: O(n). (when array is already sorted.)
Space Complexity: O(1)             
*******************************************************************************/
