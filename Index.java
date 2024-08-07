import java.io.*;
public class Index {
   
    int binarySearch(int arr[], int x)
    {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] < x)
                low = mid + 1;

            else
                high = mid - 1;
        }
        return -1;
    }

    // Driver code
    public static void main(String args[])
    {
        Index ob = new Index();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 12;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println(
                "Element is not present in array");
        else
            System.out.println("Element is present at "
                               + "index " + result);
    }
}

    

