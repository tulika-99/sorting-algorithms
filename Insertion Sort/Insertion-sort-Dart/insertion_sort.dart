import 'dart:core';

void insertionSort(List<int> list) {
  if (list == null || list.length == 0) return;
  int n = list.length;
  int temp, i, j;

  for(i=1; i< n; i++) {
    temp = list[i];
    j=i-1;
    while(j >= 0 && temp < list[j] ) {
      list[j+1] = list[j];
      --j;
    }
    list[j+1] = temp;
  }
}

void main() {
  var arr = [12, 11, 13, 5, 6];

  print('Before sorting');
  print(arr);

  insertionSort(arr);

  print('After sorting');
  print(arr);
}
