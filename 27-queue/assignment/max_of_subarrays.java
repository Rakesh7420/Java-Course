package assignment;
import java.util.*;
public class max_of_subarrays {
public static void maxsubarray(int arr[],int k,int N){
        int max = Integer.MIN_VALUE;

        // traverse from an index till the next k numbers
        for(int i = 0 ; i <= arr.length - k ; i++) {
            max = arr[i];
            for(int j = i + 1 ; j <= i + k - 1; j++) {
                // find the maximum number
                max = Math.max(max, arr[j]);
            }
            System.out.print(max+" ");
        }
    }

    // driver Code
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2 ,3 ,1 ,4 ,5 ,2 ,3, 6};
        int k = 3;
        int N=9;
        maxsubarray(arr, k,N);
    }
}
