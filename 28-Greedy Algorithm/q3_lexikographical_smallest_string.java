import java.util.*;

public class q3_lexikographical_smallest_string {
public static char[] lexiko(int n,int k){
char arr[]=new char [n];
    Arrays.fill(arr,'a');

    for(int i=n-1;i>=0;i--){
        k-=i;
        if(k>=0){
            if(k>=26){
                arr[i]='z';
                k-=26;
            }else{
                arr[i]=(char)(k+97-1);
                k-=arr[i]+'a'-1;

            }
        }else
            break;
        k+=i;
    }
    return arr;
}
    public static void main(String[] args) {
int n=5;int k=42;
char ans[]=lexiko(n,k);
        System.out.println(new String (ans));
    }
}
