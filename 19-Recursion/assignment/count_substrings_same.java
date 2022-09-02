public class count_substrings_same {
    public static void main(String[] args) {
        String str="aba";
        int n=str.length();
        System.out.println(countsubstring(str, 0, n-1, n));
    }

    public static int countsubstring(String str,int i,int j,int n){
 if(n==0 || n==1){
    return n;
 }
 int res=countsubstring(str, i+1, j, n-1)+countsubstring(str, i, j-1, n-1)-countsubstring(str, i+1, j-1, n-2);
 if(str.charAt(i)==str.charAt(j)){
    res++;
 }
 return res;
    }
}
