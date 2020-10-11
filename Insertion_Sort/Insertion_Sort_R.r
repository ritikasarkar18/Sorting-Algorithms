#!/usr/bin/env Rscript

insertion_sort <- function(list) {
    for (index in seq_len(length(list) - 1)) {
        currentval <- list[index]
        position <- index
        while (position > 1 && list[position - 1] > currentval) {
            list[position] <- list[position - 1]
            position <- position - 1
        }
        list[position] <- currentval
    }
  return(list)
}

list <- c(6, 5, 3, 1, 8, 7, 2, 4)
print(list)
list_sorted <- insertion_sort(list)
print(list_sorted)
