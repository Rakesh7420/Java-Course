public class lastocc {
    public static void main(String[] args) {
        int arr[]={8,3,6,8,6,8,4,3,7};
        int key=8;
        System.out.println(last(arr, key, 0));
    
    }

    public static int last(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=last(arr,key,i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
}
