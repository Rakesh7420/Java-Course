package assignment;
import java.util.*;
public class q2_connect_rope {
    public static int connect(int arr[], int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
        }
        int res = 0;
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            res += first + second;
            pq.add(first + second);
        }
return res;
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 3, 6};
        int size= arr.length;
        System.out.println("Total cost for connecting "+"ropes is = " + connect(arr,size));
        int arr1[] = {1,2,3};
        int size1= arr1.length;
        System.out.println("Total cost for connecting "+"ropes is = " + connect(arr1,size1));
    }
}