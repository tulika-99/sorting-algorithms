let array = [5,2,1,8,9]

shuffle = function(array) {
    for(var j, x, i = array.length; i; j = Math.floor(Math.random() * i), x = array[--i], array[i] = array[j], array[j] = x);
    return array;
};
 
isSorted = function(array){
    for(var i=1; i<array.length; i++) {
        if (array[i-1] > array[i]) {
            return false; 
        }
    }
    return true;
}
 
bogosort = function(array){
    var sorted = false;
    while(sorted == false){
        array = shuffle(array);
        sorted = isSorted(array);
    }
    return array;
}

console.log('before sort:', array)
console.log('after sort:',bogosort(array))