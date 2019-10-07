List<int> bubbleSort(List<int> input) {
  
  List<int> numbers = input;
  int length = input.length;

  for (int k = 0; k < length; k++) {
    for(int i = 0; i < length - 1; i++) {
      if(numbers[i] > numbers[i + 1]) {
        int temp = numbers[i];
        numbers[i] = numbers[i + 1];
        numbers[i + 1] = temp;
      }
    }
  }

  return numbers;
}

main() {
  List<int> numbers = [45,88,0,-23,66,1];
  print(bubbleSort(numbers));
}
