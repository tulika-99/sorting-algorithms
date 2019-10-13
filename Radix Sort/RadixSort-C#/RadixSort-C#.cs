using System;  
    
class GFG  
{  
    public static int getMax(int[] arr, int n)  
    {  
        int mx = arr[0];  
        for (int i = 1; i < n; i++)  
            if (arr[i] > mx)  
                mx = arr[i];  
        return mx;  
    }  
        
    public static void countSort(int[] arr, int n, int exp)  
    {  
        int[] output = new int[n]; // output
        int x; 
        int[] count = new int[10]; 
          
        //initializing all elements of count to 0 
        for(x = 0; x < 10; x++) 
            count[x] = 0; 
        
        // Store count of occurrences in count[]  
        for (x = 0; x < n; x++)  
            count[ (arr[x]/exp)%10 ]++;  
        
        // Change count[i] so that count[i] now contains actual  
        //  position of this digit in output[]  
        for (x = 1; x < 10; x++)  
            count[x] += count[x - 1];  
        
        // output array creation
        for (x = n - 1; x >= 0; x--)  
        {  
            output[count[ (arr[x]/exp)%10 ] - 1] = arr[x];  
            count[ (arr[x]/exp)%10 ]--;  
        }  
        
        // Copy the output array to arr[]
        for (x = 0; x < n; x++)  
            arr[x] = output[x];  
    }  
        
    // The radix sort function that does radix sort 
    public static void radixsort(int[] arr, int n)  
    {  
        // Find the max num 
        int m = getMax(arr, n);  
        
        // counting sort portion
        for (int exp = 1; m/exp > 0; exp *= 10)  
            countSort(arr, n, exp);  
    }  
    public static void print(int[] arr, int n)  
    {  
        for (int i = 0; i < n; i++)  
            Console.Write(arr[i] + " ");  
    }  
        
    // test the program 
    public static void Main() 
    { 
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};  
        int n = arr.Length;  
        radixsort(arr, n);  
        print(arr, n);  
    }  
} 