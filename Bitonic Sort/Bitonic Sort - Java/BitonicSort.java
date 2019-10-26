import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BitonicSort {
	void compAndSwap(int a[], int i, int j, int dir) {
		if ((a[i] > a[j] && dir == 1) || (a[i] < a[j] && dir == 0)) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}

	void bitonicMerge(int a[], int low, int cnt, int dir) {
		if (cnt > 1) {
			int k = cnt / 2;
			for (int i = low; i < low + k; i++)
				compAndSwap(a, i, i + k, dir);
			bitonicMerge(a, low, k, dir);
			bitonicMerge(a, low + k, k, dir);
		}
	}

	void bitonicSort(int a[], int low, int cnt, int dir) {
		if (cnt > 1) {
			int k = cnt / 2;

			bitonicSort(a, low, k, 1);

			bitonicSort(a, low + k, k, 0);

			bitonicMerge(a, low, cnt, dir);
		}
	}

	void sort(int a[], int N, int up) {
		bitonicSort(a, 0, N, up);
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		List<Integer> numberList = new ArrayList<Integer>();

		while (sc.hasNext()) {
			int number = sc.nextInt();
			numberList.add(number);
		}

		sc.close();

		int[] a = numberList.stream().mapToInt(i -> i).toArray();

		int up = 1;

		int size = a.length;
		System.out.println(size);
		boolean powerOfTwo = (size > 0) && ((size & (size - 1)) == 0);

		if (powerOfTwo == true) {
			BitonicSort ob = new BitonicSort();
			ob.sort(a, a.length, up);
			System.out.println("\nThe sorted array is:");
			printArray(a);
		} else {
			System.out.println("\nThe size of the input must be a power of 2.");
		}
	}
}