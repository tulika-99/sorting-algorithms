import 'dart:math';

List<int> countingSort(List<int> arr) {
  // the max and the min values from the array
  int maxVal = arr.reduce(max);
  int minVal = arr.reduce(min);

  // range of values or the difference between the max and the min value
  int rangeVal = maxVal - minVal + 1;

  // will keep the count of frequency of each element in the input array
  List<int> countElementsArr = List<int>.filled(rangeVal, 0);

  // the sorted array
  List<int> sortedArr = List<int>.filled(arr.length, 0);

  // counting the freq of each element in the array
  for (int i = 0; i < arr.length; i++) {
    countElementsArr[arr[i] - minVal]++;
  }

  // Change countElementsArr[i] so that countElementsArr[i] now contains actual
  // position of this element in sorted array
  for (int i = 1; i < countElementsArr.length; i++) {
    countElementsArr[i] += countElementsArr[i - 1];
  }

  // sorting the array
  for (int i = arr.length - 1; i >= 0; i--) {
    sortedArr[countElementsArr[arr[i] - minVal] - 1] = arr[i];
    countElementsArr[arr[i] - minVal]--;
  }

  return sortedArr;
}

void main() {
  List<int> arr = [-5, -10, 0, -3, 8, 5, -1, 10];

  List printArr = countingSort(arr);

  for (int i in printArr) {
    print(i);
  }
}
