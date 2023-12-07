//Bubble sort

import java.util.*;
public class Main{
  public static void printArray(int arr[])
  {
    // Otput of the Bubble sort
     System.out.print("sorted array is:");
    for(int j=0;j<arr.length;j++)
      {
       
        System.out.print(arr[j]+" ");
      }
    System.out.println();
  }
public static void main(String[]args)
  {
  System.out.print("Enter the size of array:");
   Scanner sc = new Scanner(System.in);
   int size = sc.nextInt();
   int arr[] = new int[size];
   System.out.println("Enter the array elements:");
    // Taking input
   for(int i=0;i<size;i++)
    {
       arr[i] = sc.nextInt();
    }
    // 
    for(int j=0;j<size-1;j++)
      {
        for(int k=0;k<size-1-j;k++)
          {
            if(arr[k]>arr[k+1])
            {
              int temp = arr[k];
              arr[k]=arr[k+1];
              arr[k+1]=temp;
            }
          }
        
      }
    // calling the function
    printArray(arr);
   
  }
}