namespace bubblesort
{
    public class bubblesort
    {
        public int[] BubbleSort(int[] array)
        {
            int tmp;

            for (int i = 0; i < array.Length; i++)
            {
                for (int y = i + 1; y < array.Length; y++)
                {
                    tmp = array[i];
                    if (tmp > array[y])
                    {
                        array[i] = array[y];
                        array[y] = tmp;
                    }
                }
            }
            return array;
        }
    }
}