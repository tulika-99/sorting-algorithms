/**
 * Brick Sort algorithm.
 * A variation of the Bubble Sort algorithm which in each iteration performs a bubble sort in two steps,
 * first on odd indexed elements, then on even indexed elements.
 * Complexity: O(N^2).
 * @param {Array} arr Input array.
 * @return {Array} Sorted array.
 */
const brickSort = (arr) => {
  // Swaps array elements at indexes i and j
  const swapElements = (arr, i, j) => {
    let temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  };

  let sorted = false;

  while (!sorted) {
    sorted = true;
    // Loop through and sort odd indexed elements
    for (let i = 1; i < arr.length - 1; i += 2)
      if (arr[i] > arr[i + 1]) {
        swapElements(arr, i, i + 1);
        sorted = false;
      }

    // Loop through and sort even indexed elements
    for (let i = 0; i < arr.length - 1; i += 2)
      if (arr[i] > arr[i + 1]) {
        swapElements(arr, i, i + 1);
        sorted = false;
      }
  }

  return arr;
};
