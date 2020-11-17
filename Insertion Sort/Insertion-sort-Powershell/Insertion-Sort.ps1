<#
Input: 4,2,1,6,9,3,8,7
Output: 1,2,3,4,6,7,8,9

Insertion Sort Algorithm:
========================
function insertionSort(array A)
    for i from 1 to length[A]-1 do
        value := A[i] 
        j := i-1
        while j >= 0 and A[j] > value do
            A[j+1] := A[j]
            j := j-1
        done
        A[j+1] = value
    done
#>

function insertionSort($arr){
	for($i=0;$i -lt $arr.length;$i++){
		$val = $arr[$i]
		$j = $i-1
		while($j -ge 0 -and $arr[$j] -gt $val){
			$arr[$j+1] = $arr[$j]
			$j--
		}
		$arr[$j+1] = $val
	}
}
 
$arr = @(4,2,1,6,9,3,8,7)
insertionSort($arr)
$arr -join ","
