package fr;

public class CountingSort {

	public static void main(String[] args) {
		int[] tableToSort =  { 7, 5, 8, 9, 4, 3, 7, 2, 7, 5, 2, 4, 7};
		sort(tableToSort);
		
		// Ta-dam ! tableToSort is sorted
	}

	private static void sort(int[] tableToSort) {
		if(tableToSort.length < 2) return;
		
		int min = tableToSort[0];
		int max = tableToSort[0];

		// We recover the minimum and maximum value ...
		for (int i = 1; i < tableToSort.length; i++) {
			if(tableToSort[i] < min) {
				min = tableToSort[i];
			} else if(tableToSort[i] > max) {
				max = tableToSort[i];
			}
		}
		
		// ... to create an optimized table ...
		int[] intermediateTable = new int[max - min + 1];
		
		// ... whose values are initialized to zero.
		for (int i = 0; i < intermediateTable.length; i++) {
			intermediateTable[i] = 0;
		}
		
		// We count the number of occurrences of a value and
		// we add it to the index of the value - min
		for (int i = 0; i < tableToSort.length; i++) {
			intermediateTable[tableToSort[i] - min]++;
		}
		
		// We fill the table with the number of times a value 
		// has been repeated. The cursor represents the index 
		// of the table to fill
		int cursor = 0;
		for (int i = 0; i < intermediateTable.length; i ++) {
			for(int j = 0; j < intermediateTable[i]; j++) {
				tableToSort[cursor++] = i + min;
			}
		}
	}

}
