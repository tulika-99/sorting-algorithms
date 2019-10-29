function sortedArray = quickSort(array)
 
    if numel(array) <= 1     
        sortedArray = array;
        return
    end
 
    pivot = array(end);
    array(end) = [];
 
    sortedArray = [quickSort( array(array <= pivot) ) pivot quickSort( array(array > pivot) )];
 
end