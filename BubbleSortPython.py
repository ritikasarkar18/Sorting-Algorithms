#python program for bubble sort
def bubbleSort(list):
    l =len(list)

    for i in range(l-1):
        for j in range(0,l-i-1):
            
            # Swap if the element found is greater than the next element 
             
            if list[j] > list[j+1]:
                list[j], list[j+1] = list[j+1],  list[j]  


list=[10,14,9,5,2,18,7]

bubbleSort(list)
#sorted array = 2,5,7,9,10,14,18
print("Sorted array is: ")
for i in range(len(list)):
    print(list[i])