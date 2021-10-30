// CountingSort
// the array must only consist of integer numbers!

function countingSort(a : number[]) {
    if(a.length < 2) {
        return
    }

    let min : number = a[0];
    let max : number = a[0];

    // We recover the minimum and maximum value
    for (let i : number = 1; i < a.length; i++) {
        if(a[i] < min) {
            min = a[i];
        } else if(a[i] > max) {
            max = a[i];
        }
    }

    // create an array to count each occurrence of every number
    let count : number[] = [];

    // this array is initialized with 0's
    for (let i : number = 0; i <= max; i++) {
        count[i] = 0;
    }

    // We count the number of occurrences of a value and
    // we add it to the index of the value - min
    for (let i :number = 0; i < a.length; i++) {
        count[a[i] - min]++;
    }

    // We fill the table with the number of times a value
    // has been repeated. The cursor represents the index
    // of the table to fill
    let cursor : number = 0;
    for (let i : number = 0; i < count.length; i ++) {
        for(let j : number = 0; j < count[i]; j++) {
            a[cursor++] = i + min;
        }
    }

}

//tests
let arr : number[] = [4, 6, 2, 11, 1, 2, 50, 0, 1, 100];
let expected: number[] = [0, 1, 1, 2, 2, 4, 6, 11, 50, 100];

console.log("arry to be sorted: " + arr);

console.log("array to be expected: " + expected);

countingSort(arr);

console.log("now sorted array: " + arr);
