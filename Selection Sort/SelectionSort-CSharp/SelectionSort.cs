using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TP1
{
    class SelectionSort
    {
        static void Main(string[] args)
        {
            Random random = new Random();
            int[] array = new int[1000];
            for (int i = 0; i < 1000; i++)
            {
                array[i] = random.Next(Int32.MinValue, Int32.MaxValue);
            }
            Console.WriteLine(imprimeVetor(array, 1000));
            SelSort(array, 1000);
            Console.WriteLine("");
            Console.WriteLine(imprimeVetor(array, 1000));
            Console.ReadKey();
        }
        static string imprimeVetor(int[] vet, int tam)
        {
            string array = "[";
            for (int i = 0; i < tam; i++)
            {
                array += vet[i] + ", ";
            }
            array = array.Remove(array.Length - 2, 1) + "]";
            return array;
        }
        static void SelSort(int[] vet, int tam)
        {
            int menor, aux;
            for (int i = 0; i < (tam - 1); i++)
            {
                menor = i;
                for (int j = (i + 1); j < tam; j++)
                {
                    if (vet[j] < vet[menor])
                        menor = j;
                }
                if (vet[i] != vet[menor])
                {
                    aux = vet[i];
                    vet[i] = vet[menor];
                    vet[menor] = aux;
                }
            }
        }
    }

}
