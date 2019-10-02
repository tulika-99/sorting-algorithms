#include <stdio.h>
#define MAXSIZE 100 
void displayArray(int array[], int size)
{
	int i;
	for(i = 0; i < size; i++)
		printf("%d\t", array[i]);
	printf("\n");
	return;
}

void insertionSort(int array[], int size)
{
	int i, j, temp;
        for (i = 1 ; i <= size - 1; i++) 
	{
                j = i;
                while ( j > 0 && array[j-1] > array[j]) 
		{
                        temp = array[j];
                        array[j] = array[j-1];
                        array[j-1] = temp;
                        j--;
                }
        }
	printf("\nInsertion sort has been performed. \n");
	return;
}

int main()
{
	int size, array[MAXSIZE], i, j, t;

        printf("Enter number of elements : ");
        scanf("%d", &size);

        printf("Enter the %d integers to be the elements of the array. \n", size); 
 
        for (i = 0; i < size; i++)
                scanf("%d", &array[i]);
 
	printf("\nThe array entered is : \n");
	displayArray(array,size);  
	
	insertionSort(array,size);
 
        printf("\nSorted array in ascending order :\n");
 	displayArray(array,size);
        return 0;
}