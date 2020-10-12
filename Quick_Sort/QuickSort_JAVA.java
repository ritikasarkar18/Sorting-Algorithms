class QuickSort 
{ 
    static int partition(int arr[], int low, int high) 
    /*This will find the correct position of the pivot element which is the last element of the 
    array and then send its index position*/
    { 
        int pivot = arr[high];  
        int i = (low-1); 
        for (int j=low; j<high; j++) 
        { 
            if (arr[j] < pivot) 
            { 
                i++; 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
  
    static void sort(int arr[], int low, int high)
     /*It will recursively call the partition function and
      for each call there would be two partition*/
    { 
        if (low < high) 
        { 
            int pi = partition(arr, low, high); 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 

  
    // Driver program 
    public static void main(String args[]) 
    { 
        int arr[] = {10, 7, 8, 9, 1, 5}; 
        sort(arr,0,arr.length-1);  
        System.out.println("Displaying sorted array"); 
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    } 
} 
