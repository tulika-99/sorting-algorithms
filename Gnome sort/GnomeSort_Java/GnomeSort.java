package otros.algoritmos;

import java.util.Arrays;

public class GnomeSort {
	
	static void gnomeSort(int arr[], int x) {
		int cont = 0;
		while(cont < x) {
			if (cont == 0) {
				cont++;
			} else if (arr[cont] >= arr[cont - 1]) {
				cont++;
			} else {
				int tmp = 0;
				tmp = arr[cont];
				arr[cont] = arr[cont - 1];
				arr[cont - 1] = tmp;
				cont--;
			}
		}
		return;
	}

	public static void main(String[] args) {
		int arr[] = { 345, 123, 34, 45, -15, -89, 0, -124};
		gnomeSort(arr, arr.length);
		System.out.print(Arrays.toString(arr));

	}

}
