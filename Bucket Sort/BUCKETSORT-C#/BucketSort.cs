class BucketSort
{
  public static void BucketSortFunction(int[] arr, int minValue, int maxValue)
  {
    int range = maxValue - minValue + 1;
    int[] hist = new int[range];
    foreach (int num in arr)
    {
      hist[num - minValue] += 1;
    }

    int index = 0;
    for(int i=0; i < range; i++)
    {
      for(int j = 0; j<hist[i]; j++)
      {
        arr[index] = i + minValue;
        index++;
      }
    }
  }
}