import java.io.*;
import java.util.Scanner;
public class bubble_sort{
    public static void main(String[] args) {
        System.out.println("bubble sort is the easist sorting algorithm technique");
        
        int arr[]={2,31,78,11,22,64};
        int n=arr.length;
        fun(n,arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void fun(int n, int arr[]){
     
        int temp=0;
        boolean flag=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false){
                break;
            }
        }
    }
}

//time complexity= worst case : O(n^2)
//                  best case:O(n)
//                  average:O(n^2)
//hence for large dataset it is recomended to do not use bubble sort.

    
