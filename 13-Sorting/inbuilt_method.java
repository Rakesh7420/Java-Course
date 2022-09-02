import java.util.Arrays;

import java.util.Collections;

public class inbuilt_method {
    
    // //for ascending
    // public static void printArr(int arr[]) {
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    
    //     System.out.println();
    // }
    // // public static void main(String args[]){
    //     //     int arr[]={5,4,1,3,2};
    //     //     Arrays.sort(arr);
    //     //     printArr(arr);
    //     // }
        
    //     //for descending or reverse order
        public static void printArr(Integer arr[]) {
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        
            System.out.println();
        }
    
    public static void main(String args[]){
        Integer arr[]={5,4,1,3,2};
        Arrays.sort(arr,Collections.reverseOrder());
        printArr(arr);
    }
}
