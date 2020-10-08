# Selection Sort
![gif](https://i2.wp.com/algorithms.tutorialhorizon.com/files/2019/01/Selection-Sort-Gif.gif?)

### A Selection Sort works as follows:
* We look at the first item in the array. This is 5. Next we search the whole Array for the smallest number (1). Once we find that, we swap the numbers.
* Now with the smallest number in the first position. We look at the next number (3), find the next smallest number (2) and swap them.
* We continue this until all the numbers are sorted! 


### Pseudocode Example:
```
FOR i = 1 TO n - 1
  min = i    
  FOR j = i+1 TO n 
    IF list[j] < list[min] THEN
      min = j;
    END IF
  END FOR
   IF indexMin != i THEN
    SWAP list[min] AND list[i]
   END IF
END FOR

```

### This is a very common sorting algorithm and can be implemented in pretty much every language.<br>Check out the rest of this folder to see some examples of it at work!

