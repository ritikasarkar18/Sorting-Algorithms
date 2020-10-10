public class Solution {              //Name of the class is Solution and it is public
  public static void main(String[] args) {
      int arr[]={8,7,6,5,4,3,2};//Storing array elements
      System.out.println("Before sorting");
      for(int i=0;i<arr.length;i++)
      System.out.print(arr[i]+" ");
      bubble_sort_algo(arr);
      System.out.println("\nAfter sorting");
      for(int i=0;i<arr.length;i++)
      System.out.print(arr[i]+" ");
      
  }  
  static void bubble_sort_algo(int arr[])//Implementing bubble sort algorithm
  {
      int flag=0;
      for(int i=0;i<arr.length-1;i++)
      {
          for(int j=0;j<arr.length-1-i;j++)
          {
              if(arr[j]>arr[j+1])
              {
                  int swap=arr[j];     //Swapping the positions of elements
                  arr[j]=arr[j+1];
                  arr[j+1]=swap;
                  flag=1;
              }
          }
          if(flag==0)                //If array is sorted no need to sort so break
          break;
      }
  }
}
