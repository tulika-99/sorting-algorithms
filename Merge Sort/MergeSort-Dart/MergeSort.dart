void main() {
  List<int> a = [1, 2, 88, 54, -5, 90, 60, 3, 4];
  print(mergeSort(a));
}


List<int> mergeSort(List<int> numbers) {
  int length = numbers.length;
  if(length < 2) {
    return numbers;
  }
  int mid = (length / 2).floor();
  List<int> left = new List(mid);
  List<int> right = new List(length - mid);
  
  for (int i = 0; i < mid; i++) {
    left[i] = numbers[i];
  }
  for (int i = mid; i < length; i++) {
    right[i - mid] = numbers[i];
  }
  left = mergeSort(left);
  right = mergeSort(right);
  
  return merge(left, right, numbers);
}

List<int> merge(List<int> left, List<int> right, List<int> A) {
  int lengthLeft = left.length;
  int lengthRight = right.length;
  int i = 0;
  int j = 0;
  int k = 0;
  
  while (i < lengthLeft && j < lengthRight) {
    if (left[i] <= right[j]) {
      A[k] = left[i];
      i += 1;
    }  else {
      A[k] = right[j];
      j += 1;
    }
    k += 1;
  }
  
  while (i < lengthLeft) {
    A[k] = left[i];
    i += 1;
    k += 1;
  }
  
  while (j < lengthRight) {
    A[k] = right[j];
    j += 1;
    k += 1;
  }
  return A;
}