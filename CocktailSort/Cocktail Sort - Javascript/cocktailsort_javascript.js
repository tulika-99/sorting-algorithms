let arr = [2, 4, 1, 6, 8, 5, 9, 3, 4];

let is_Sorted = true;
while (is_Sorted) {
    for (let i = 0; i< arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            let temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i+1] = temp;
            is_Sorted = true;
        }
    }

    if (!is_Sorted) break;

    is_Sorted = false;

    for (let j = arr.length - 1; j > 0; j--) {
        if (arr[j-1] > arr[j]) {
            let temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
            is_Sorted = true;
        }
    }
}

console.log(arr)