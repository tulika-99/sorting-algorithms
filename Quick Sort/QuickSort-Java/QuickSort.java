public class QuickSort {

    public static void quickSort(int[] input) {


        int n=input.length;
        qsort(input,0,n-1);

    }

    // we can mae a separate fnctn for the sa caculation part which returns
    // us the index c after arranging the array then we just need to pass the 2 parts
    public static void qsort(int input[],int s,int e)
    {

        //base case
        if(s>=e)
            return;


        int a=input[s];

        int count=s;
        for(int i=s+1;i<=e;i++)
        {
            if(input[i]<=a)
                count++;
        }

        input[s]=input[count];
        input[count]=a;

        int i=s;
        int j=e;
        while(i<=count && j>=count)
        {
            if(input[i]<=a)
                i++;
            else
            {
                if(input[j]<=a)
                {
                    //swap

                    int temp=input[j];
                    input[j]=input[i];
                    input[i]=temp;
                    i++;
                    j--;
                }
                else
                    j--;
            }
        }
        //array is now arranged
        qsort(input,s,count-1);
        qsort(input,count+1,e);

    }
    /* A utility function to print array of size n*/
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
        quickSort(arr);

        printArray(arr);
    }

}
