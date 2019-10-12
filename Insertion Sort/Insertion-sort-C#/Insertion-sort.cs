// C# program for implementation of Insertion Sort 
using System; 

public class InsertionSort { 
	
	public static void Main() 
	{ 
		int[] arr = { 12, 11, 13, 5, 6 }; 
		InsertionSort insertionSort = new InsertionSort(); 
		insertionSort.sort(arr); 
		printArray(arr); 
	} 

	void sort(int[] array) 
	{ 
		int n = array.Length; 
		for (int i = 1; i < n; ++i) { 
			int key = array[i]; 
			int j = i - 1; 

			// Move elements of arr[0..i-1], that are greater than key, 
			// to one position ahead of their current position 
			while (j >= 0 && array[j] > key) { 
				array[j + 1] = array[j]; 
				j = j - 1; 
			} 
			array[j + 1] = key; 
		} 
	} 

	static void printArray(int[] arr) 
	{ 
		int n = arr.Length; 
		Console.Write("Sorted array: ");
		for (int i = 0; i < n; ++i) 
			Console.Write(arr[i] + " "); 

		Console.Write("\n"); 
	}
} 
