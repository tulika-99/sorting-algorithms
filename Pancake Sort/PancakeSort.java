public class PancakeSort {

    public static void sort(int []arr) {
        for(int i=arr.length; i > 1; i--) {
            int max = findMax(arr, i);
            if(max != i-1) {
                flip(arr, max+1);
                flip(arr, i);
            }
        }
    }


    public static int findMax(int []arr, int length) {
        int max = 0;
        for(int i = 1; i < length; i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    public static void flip(int []arr, int length) {
        for(int i = 0; i < length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }
    }

    public static void main(String []args) {
        java.util.Random r = new java.util.Random();
        //will run 10 tests
        for (int i = 0; i < 10; i++){
            System.out.println("case: "+i);
            //randon length of array between 15 and 2
            int arr[] = new int[r.nextInt((15 - 2) + 1) + 2];
            for (int j = 0; j < arr.length; j++) {
                //random number -10 - 10
                arr[j] = r.nextInt((10 + 10) + 1) - 10;
                System.out.print(arr[j] + " ");
            }
            System.out.println("\nsorted");
            sort(arr);
            System.out.print(arr[0] + " ");
            for (int j = 1; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
                if (arr[j-1] > arr[j]) {
                    System.out.println("ERROR!");
                    System.exit(-1);
                }
            }
            System.out.println("\nsorted correctly");
        }

    }

}
