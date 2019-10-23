function [array] = insertion_sort(array)
	for i = 2:array.size()
		tmp = array[i];
		j = i - 1;
		while (j => 1 && array[j] > tmp)
			array[j+1] = array[j];
			j = j-1;
		end

		array[j+1] = tmp;
	end
end
