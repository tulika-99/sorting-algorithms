class ShellSort { 
    int sort(int arr[]) { 
        int n = arr.length; 
        for (int gap = n/2; gap > 0; gap /= 2) { 
            for (int i = gap; i < n; i += 1) { 
                int temp = arr[i]; 
                int j; 
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap]; 
                }
                arr[j] = temp; 
            } 
        } 
        return 0; 
    } 
    public static void main(String args[]) { 
        int arr[] = {16, 53, 48, 62, 5}; 
        ShellSort shellSort = new ShellSort(); 
        shellSort.sort(arr); 
    } 
}  