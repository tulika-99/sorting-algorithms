using System;
using System.Collections.Generic;
using System.Linq;

namespace ConsoleTests
{
    public class CountingSort<T>
    {
        public void Sort(List<T> inputArr)
        {
            Dictionary<T, int> keyValuePairs = new Dictionary<T, int>();
            List<T> inPlaceTracker = new List<T>();
            inputArr.ForEach(i =>
            {
                if (keyValuePairs.ContainsKey(i))
                {
                    keyValuePairs[i]++;
                }
                else
                {
                    keyValuePairs.Add(i, 1);
                    inPlaceTracker.Add(i);
                }
            });
            System.Console.Write("Sorted Array: ");
            keyValuePairs.Keys.ToList().ForEach(i =>
            {
                for (int ctr = 0; ctr < keyValuePairs[i]; ctr++)
                {
                    System.Console.Write(i+" ");
                }
            });
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            new CountingSort<int>().Sort(new List<int>() { 2, 4, 5, 1, 2, 4, 3, 6, 4, 2, 6, 8, 1, 9, 0 });
            new CountingSort<double>().Sort(new List<double>() { 2.1, 2.4, 5.1, 1.1, 2.1, 2.4, 2.3, 2.6, 2.4, 2.2, 6.2, 2.8, 2.1, 9.2, 0.4 });
            new CountingSort<char>().Sort(new List<char>() { 'a', 'f', 'g', 'f', 'g', 'a', 'a', 'f', 'k', 't', 'f', 't', 'a', 'f', 'z' });
        }
    }
}
