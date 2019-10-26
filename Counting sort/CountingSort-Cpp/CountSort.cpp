void CountSort(int arr[],int len)
{
    int min = arr[0], max = arr[0];
    for(int i = 0; i < len; i++)//finds maximum and minimum elements of array 
    {
        if(arr[i] < min)
            min = arr[i];
        if(arr[i] > max)
            max = arr[i];
    }
    int count[max - min + 1] = {0};

    int sorted_arr[len] = {0};

    int range = max - min + 1;//stores size of count arr

    for(int i = 0; i < len; i++)
        count[arr[i] - min]++;//Counts frequency of element and stores in index corresponding to number

    for(int i = 1; i < range; i++)
        count[i] += count[i-1];//Takes prefix sum of count array

    for(int i = len - 1; i >= 0; i--)//sorts sorted_arr
    {
        sorted_arr[count[arr[i] - min] - 1] = arr[i];
        count[arr[i] - min]--;
        
    }
    for(int i = 0; i < len; i++)
        arr[i] = sorted_arr[i];//stores sorted array back into original array

}
int main()
{
    int arr[] = {2,4,5,6,2,6,8,2,1,8};
    int len = sizeof(arr)/sizeof(arr[0]);//Stores number of elements in arr
    CountSort(arr,len);
    return 0;
}
