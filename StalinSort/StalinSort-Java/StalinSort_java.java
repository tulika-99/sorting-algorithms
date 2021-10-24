// Algorithm to sort the array by using the variation of the Stalin Sort

package Stalin_Sort;

import java.util.*;
class StalSort
{
 
  // Function to sort the array
  static void variationStalinsort(Vector<Integer> arr)
  {
    int j = 0;
    while(true)
    {
      int moved = 0; 
      for(int i = 0;
          i < (arr.size() - 1 - j); i++)
      {
        if (arr.get(i) > arr.get(i+1))
        {
          //Iterator<Integer> index = arr.iterator();
          int index;
          int temp;
          index = arr.get(i);
          temp = arr.get(i + 1);
          arr.removeElement(index);
          arr.add( i, temp);
          arr.removeElement(temp);
          arr.add(i+1, index);
          moved++;
        }
      }  
      j++;    
      if (moved == 0)
      {
        break;
      }
    }
    System.out.print(arr);
 
  }
 
  // Driver Code
  public static void main(String[] args)
  {
    int[] arr = { 2, 1, 4, 3, 6,
                 5, 8, 7, 10, 9 };
    Vector<Integer> arr1 = new Vector<>();
    for(int i = 0; i < arr.length; i++)
      arr1.add(arr[i]);
 
    // Function call
    variationStalinsort(arr1);
  }
}
 