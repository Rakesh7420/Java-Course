public class bubble_sort{
    //ascending order
public static void ascending (int arr[]) {
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]>arr[j+1]){
                //swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

            }  } }
}
    //descending order
public static void descending (int arr[]) {
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]<arr[j+1]){
                //swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

            }  } }
}

public static void printArr(int arr[]) {
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }

    System.out.println();
}
public static void main(String[] args) {
    int arr[]={5,4,1,3,2};
    descending(arr);
    printArr(arr);
    
    printArr(arr);
    ascending(arr);
}
}