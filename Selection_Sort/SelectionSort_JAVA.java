class selectionsort {
    public static void main(String[] args) {
        int arr[]={12,11,10,9,7};            //Initial array
        selection_sort_algo(arr);
        System.out.println("Printing all elements");
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");

    }
    static void selection_sort_algo(int arr[])  //Selection sort algorithm
    {
         for(int i=0;i<arr.length-1;i++)
         {
             int small=arr[i];
             int index=i;
             for(int j=i+1;j<arr.length;j++)      //Finding minimum element
             {
                  if(arr[j]<small)
                  {
                      small=arr[j];
                      index=j;
                  }
             }
             int k=arr[i];             //Swapping the elements
             arr[i]=arr[index];
             arr[index]=k;
         }
    }
}
