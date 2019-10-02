import java.util.*;

public class BogoSort {
   private static final Random RAN_OUTPUT = new Random();
   
    public static void bogoSort(int[] arr) {
      while (isSorted(arr) == false) {
         for (int i = 0; i < arr.length; i++) {
            int randomIndex = RAN_OUTPUT.nextInt(arr.length);
            int holder = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = holder;
         }
      }
    }
    
    private static boolean isSorted(int[] arr) {
      for (int i = 0; i < arr.length - 1; i++) {
         if (arr[i] > arr[i+1]) {
            return false;
         } 
      }
      return true;
    }
    
    public static void main(String[] args) {
      int[] arr = {3, 1, 2};
      System.out.println("Before Sort: " + Arrays.toString(arr));
      bogoSort(arr);
      System.out.println("After Sort: " + Arrays.toString(arr));
    }
    
}