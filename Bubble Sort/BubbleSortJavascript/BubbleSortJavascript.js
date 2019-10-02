let numbers = [5, 7, 10, 4, 1, 8, 11, 14, 6, 2, 17, 14, 3, 9, 20, 13, 18]; //or you decide what is the number of array!!
let countSwap = 0;

const BubbleSortArray = (numbers) => {
   countSwap = 0;
   numbers.forEach((num, index) => {
      if (numbers[index] > numbers[index + 1]) {
        countSwap += 1;
        let temp = numbers[index];
        numbers[index] = numbers[index + 1];
        numbers[index + 1] = temp;
      }
   });
}

do {
   BubbleSortArray(numbers);
} while (countSwap > 0);

console.log(numbers);