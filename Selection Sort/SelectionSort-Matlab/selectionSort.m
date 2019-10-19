function array = selectionSort(array)
    arraySize = numel(array);
    for i = (1:arraySize-1)
        min = array(i);
        minIndex = i;
        
        for j = (i:arraySize)
            if array(j) <= min
                min = array(j);
                minIndex = j;
            end
        end
        
        if i ~= minIndex
            array([minIndex i]) = array([i minIndex]);
        end
    end         
end

