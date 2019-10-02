function selectionSort(a) {
	var l = a.length;
	for (var i = 0; i < (l - 1); i++) {
		var p = i;
		for (var j = i + 1; j < l; j++) {
			if (a[j] < a[p])
				p = j;
		}
		var t = a[p];
		a[p] = a[i];
		a[i] = t;
	}
	return a;
}

var arr = [5, 1, 3, 4, 2];
var sorted_arr = selectionSort(arr);
console.log('Before sorting');
console.log(arr);
console.log('After sorting');
console.log(sorted_arr);
