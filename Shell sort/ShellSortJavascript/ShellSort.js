const shellSort = (array) => {
    var inc = array.length / 2;
    while (inc > 0) {
        for (i = inc; i < array.length; i++) {
            var j = i;
            var temp = array[i];
    
            while (j >= inc && array[j-inc] > temp) {
                array[j] = array[j-inc];
                j = j - inc;
            }
    
            array[j] = temp;
        }
    
        if (inc == 2) {
            inc = 1;
        } else {
            inc = parseInt(inc*5 / 11);
        }
    }
  return array;
}

const test = shellSort([3, 0, 2, 5, -1, 4, 1])
console.log(test);