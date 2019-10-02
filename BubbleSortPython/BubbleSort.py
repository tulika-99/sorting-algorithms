def bubbleSort(listofnumbers):
    for allnumbers in range(len(listofnumbers)-1,0,-1):
        for i in range(allnumbers):
            if listofnumbers[i]>listofnumbers[i+1]:
                a = listofnumbers[i]
                listofnumbers[i] = listofnumbers[i+1]
                listofnumbers[i+1] = a

listofnumbers = [20,10,32,45,99,17,77,31,44,55,20]
print(f"Original list: {listofnumbers}")
bubbleSort(listofnumbers)
print(f"Organized list: {listofnumbers}")
