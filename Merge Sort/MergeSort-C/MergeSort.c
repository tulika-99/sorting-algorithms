#include<stdio.h>

int count =0; //Initializing Global Count variable

//Defining Merge Function to Merge two Arrays

int merge(long int Array[], long int left1, long int right1, long int left2, long int right2) 
//Left1 & Right1 --> Array1 index Left2 & Right2 --> Array2 We are merging Array1 and Array2 to form a sorted Array

{
	long int Temp_A[1000]; //Defining a Temporary Array to store the sorted array for some time
	long int i = left1; //Initializing index variable for Array1 
	long int j = left2; //Initializing index variable for Array2
	long int k = 0;	//Initializing index variable for Temporary Array 
	
	while (i <= right1 && j <= right2 ) //Operating Loop till we reach rightmost index of any Array
	{
		//Whichever element is smaller from Array1 or Array2 is stored first in Temporary Array and this loop continues 
		if ( Array[i] < Array[j] ) 
			Temp_A[k++] = Array[i++]; //Increasing index value after it is stored
		else
			Temp_A[k++] = Array[j++]; //Increasing index value after it is stored
	}

	while (i <= right1) //Storing the remaining element (if present) in Temporary Array 
		Temp_A[k++] = Array[i++];

	while (j <= right2) //Storing the remaining element (if present) in Temporary Array
		Temp_A[k++] = Array[j++];
	
	k = 0; //Resetting the index variable for Temporary Array
	long int a = left1; //Intitializing index variable for Original Array where the final sorted numbers are stored
	while (a <= right2) //Operating till we reach final index of Array2
		Array[a++] = Temp_A[k++]; //Shifting back the sorted Temporary Array to original Array
		
}

//Defining MergeSort Function
int mergesort(long int Array[], long int left, long int right)
{
	long int middle; 		
	
	if (left < right) //Operating the function till when leftmost index is smaller than rightmost index and not equal to or greater  
	{
		middle = (left+right)/2; //Splitting Array in two half parts
		mergesort(Array, left , middle ); //Recursively calling MergeSort function for first half Array and it will be already sorted 
		mergesort(Array, middle + 1, right ); //Recursively calling MergeSort function for other half Array and it will also be already sorted 
		merge(Array, left, middle, middle + 1, right ); //Merging the Arrays we got after splitiing 
		count++; //Increasing count variable when two arrays are merged
	}	
}

int main()
{
long int Array[1000]; //Initializing an integer array
int n;

scanf("%d",&n);

for (int i = 0; i < n; i++)
{
	scanf("%ld,",&Array[i]); //Taking input as integers separated by a comma
}

mergesort(Array, 0, n-1); //Calling Mergesort Function to operate on user input array


for(int i = 0; i < n; i ++)
{
	printf("%ld ",Array[i]); //Printing sorted array as integers 
}

printf("\n");
	
printf("%d\n",count); //Printing number of merge done  

return 0;
}
