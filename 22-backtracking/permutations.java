public class permutations {
    public static  void find_permutations(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
//            System.out.println(count);
            return;
        }
        //kaam
        int count=0;
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
        String newstr=str.substring(0,i)+str.substring(i+1);
        find_permutations(newstr,ans+curr);
        count++;
    }}
    public static void main(String[] args) {
String str="abc";
find_permutations(str,"");
    }
}
