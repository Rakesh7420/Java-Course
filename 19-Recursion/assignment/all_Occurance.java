public class all_Occurance{
    public static void main(String[] args) {
       int arr[]={5,4,6,2,4,7,4,6};
       int key=4;
    que1(arr, key, 0);
    System.out.println();
    }

    public static void que1(int arr[],int key,int i){
if(i==arr.length){
    return;
}
if(arr[i]==key){
    System.out.print(i+" ");
}
que1(arr, key, i+1);
    }
}