function swap(items, leftItem, rightItem){
    const auxiliar = items[leftItem];
    items[leftItem] = items[rightItem];
    items[rightItem] = auxiliar;
}

function partition(items, left, right) {
    let pivot = items[Math.floor((right + left) / 2)];
    let leftCounter = left;
    let rightCounter = right;
    while (leftCounter <= rightCounter) {
        while (items[leftCounter] < pivot) {
            leftCounter++;
        }
        while (items[rightCounter] > pivot) {
            rightCounter--;
        }
        if (leftCounter <= rightCounter) {
            swap(items, leftCounter, rightCounter);
            leftCounter++;
            rightCounter--;
        }
    }
    return leftCounter;
}

function quickSort(items, left, right) {
    let index;
    if (items.length > 1) {
        index = partition(items, left, right);
        if (left < index - 1) {
            quickSort(items, left, index - 1);
        }
        if (index < right) {
            quickSort(items, index, right);
        }
    }
    return items;
}

let items = [2,4,9,5,8,1];
let sortedArray = quickSort(items, 0, items.length - 1);
console.log(sortedArray);