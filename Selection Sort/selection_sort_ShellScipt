#!/bin/bash
echo "enter the number"
read n
echo "enter number in an array"
for((i=0;i<n;i++))
do
read arr[$i]
done
#logic for selection sort
for((i=0;i<n-1;i++))
do
small=${arr[$i]}
index=$i
for((j=i+1;j<n;j++))
do
if((arr[j]<small))
then
small=${arr[$j]}
index=$j
fi
done
temp=${arr[$i]}
arr[$i]=${arr[$index]}
arr[$index]=$temp
done
#printing sorted array
echo "printing sorted array"
for((i=0;i<n;i++))
do
echo ${arr[$i]}
done
