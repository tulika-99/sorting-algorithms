class SelectionSort { 
    
    void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 
  
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
  
    public static void main(String args[]) 
    { 
        int arr[] = { 12, 11, 13, 5, 6 }; 
        InsertionSort ob = new InsertionSort(); 
        System.out.println("Selection Sorting");
        System.out.print("Before Sorting : ");
        for(int x = 0; x < 5; x++)
            System.out.print(arr[x]+" ");
        ob.sort(arr); 
        System.out.println("");
        System.out.print("After Sorting : ");
        printArray(arr); 
    } 
}
