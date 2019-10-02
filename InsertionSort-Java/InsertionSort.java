public class InsertionSort{
    public static void insertionSort(int[] array){
        for(int i = 1; i < array.length; i++){ //i = 1 because array of 1 element is already sorted on left side
            int key = array[i]; // insert this into sorted side of array
            int j = i-1; 
            while(array[j] > key && j >= 0){ // shift sorted side [0 -> i-1] elements that are > key to right
                array[j+1] = array[j]; //shift element to the right
                --j;
            }
            array[j+1] = key;
        }
    }
}