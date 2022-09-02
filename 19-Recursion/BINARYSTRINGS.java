public class BINARYSTRINGS {

    public static void main(String[] args) {
        PrintBinary(3, 0, "");
         }

         
    public static void  PrintBinary(int n,int lastplpace,String str){
        //BASE CASE

if(n==0){
    System.out.println(str);
    return;
}
//kaam
    PrintBinary(n-1, 0, str+"0");
    if(lastplpace==0){
        PrintBinary(n-1, 1, str+"1");
    }
    }


}
