package Sorting;
import java.util.*;
  //preserves the order
public class Bubblesort {
    public static void display(int[] arr, int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubbleSort(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }

            }
        }
        System.out.println("After Sorting: ");
        display(arr, n);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        display(arr,n);
        bubbleSort(arr, n);
        in.close();
    }
}
