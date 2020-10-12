## Bogo Sort 

BogoSort is described as a "Highly inefficient sorting algorithm'.  
It sorts by randomizing the provided dataset and then checking to see if it correctly sorted. 
If not, it randomizes again and repeats this proccess. 

## Psuedocode
``
while(!checkSorted(valueArr)){
    shuffleElements(valueArr);
}
``