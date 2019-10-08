def shellSort(array): 
  
    n = len(array) 
    gap = n/2
  
    while gap > 0: 
  
        for i in range(gap,n): 

            temp = array[i] 
            
            j = i 
            while  j >= gap and array[j-gap] >temp: 
                array[j] = array[j-gap] 
                j -= gap 
  
            array[j] = temp 
        gap /= 2



#testing
arrayToSort = [ 1, 2, 3, 4, 5,9,12,32,99,1999,0,-1,-9] 
  
n = len(arrayToSort) 

shellSort(arrayToSort) 
  
print ("\nRESULT") 
for i in range(n): 
    print(arrayToSort[i]), 
  