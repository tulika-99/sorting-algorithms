//CountingSort function with 3 parameters
//First parameter is the array that we gonna sort
//Second parameter is the min number from the array
//Third parameter is the max number from the array

const countingSort = (arr, min, max) => {
    
    let i = min,
        j = 0,
        len = arr.length,
        count = [];

//First for it's used to create an array from 0 to max number of your array
    for (i; i <= max; i++) {
        count[i] = 0;
    }

//Second for it's used to count the number of times a number appears in the array
    for (i = 0; i < len; i++) {
        count[arr[i]] += 1;
    }
//Third for it's used to create an array with the number of values contained in each index with the value of the index

    for (i = min; i <= max; i++) {
        while (count[i] > 0) {
            arr[j] = i;
            j++;
            count[i]--;
        }
    }

    return arr;
};

//Testing
const test = countingSort([9,6,6,5,1],1,9);
console.log(test)
