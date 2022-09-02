public class firstocc {
    public static void main(String[] args) {
        int arr[]={8,3,6,8,6,8,4,3,7};
        int key=5;
        System.out.println(calocc(arr, key, 0));
    
    }

    public static int calocc(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
     if(arr[i]==key){
     return i;
     }
     return calocc(arr, key, i);
    }
}
