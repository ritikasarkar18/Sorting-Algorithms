#include<iostream>
#include<algorithm>
using namespace std;

int getMax(int arr[], int n) {
   int max = arr[1];
   for(int i = 2; i<=n; i++) {
      if(arr[i] > max)
         max = arr[i];
   }
   return max;
}

void countSort(int *arr, int n) {
   int output[n+1];
   int max = getMax(arr, n);
   int count[max+1]; //initialise using value of largest element in input array

   //initialise count to 0
   for(int i = 0; i<=max; i++)
      count[i] = 0; 
   //frequency of each element
   for(int i = 1; i <=n; i++)
      count[arr[i]]++;

   //cumuative freq
   for(int i = 1; i<=max; i++)
      count[i] += count[i-1]; 

   //subtracting count for individual elements
   //getting sorted arr for in output[]
   for(int i = n; i>=1; i--) {
      output[count[arr[i]]] = arr[i];
      count[arr[i]] -= 1; 
   }

   for(int i = 1; i<=n; i++) {
      arr[i] = output[i]; 
   }
}

int main() {
   int n;
   cin >> n;
   int arr[n+1];
   for(int i = 1; i<=n; i++) {
      cin >> arr[i];
   }
   countSort(arr, n);
   for(int i = 1; i<=n; i++)
      cout << arr[i] << " ";
}