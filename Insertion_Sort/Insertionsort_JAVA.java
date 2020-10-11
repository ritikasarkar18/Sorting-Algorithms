class insertionsort {
    public static void main(String[] args) {
        int arr[]={12,3,7,9,2};            //Initial array
        insertion_sort_algo(arr);
        System.out.println("Printing all elements");
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");

    }
    static void insertion_sort_algo(int arr[])  //Insertion sort algorithm
    {
        for (int i = 1; i < arr.length; ++i) { 
            int key = arr[i]; 
            int j = i - 1;
            while (j >= 0 && arr[j] > key)
            { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    }
}
