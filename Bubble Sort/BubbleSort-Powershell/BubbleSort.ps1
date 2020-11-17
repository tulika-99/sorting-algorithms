<#
Input array: 23,54,52,4,90,88,2,32,45
Output array: 2,4,23,32,45,52,54,88,90

Algorithm:
==========
repeat
    if itemCount <= 1
        return
    hasChanged := false
    decrement itemCount
    repeat with index from 1 to itemCount
        if (item at index) > (item at (index + 1))
            swap (item at index) with (item at (index + 1))
            hasChanged := true
until hasChanged = false

#>
function bubblesort ($a) {
    $l = $a.Length
    $hasChanged = $true
    while ($hasChanged) {
        $hasChanged = $false
        $l--
        for ($i = 0; $i -lt $l; $i++) {
            if ($a[$i] -gt $a[$i+1]) {
                $a[$i], $a[$i+1] = $a[$i+1], $a[$i]
                $hasChanged = $true
            }
        }
    }
}
$a = @(23,54,52,4,90,88,2,32,45)
bubblesort($a)
echo $a
