package assignment;
import java.util.*;
public class q2_slash_problem {
    static String simplify(String str){
        Stack<String>st=new Stack<>();
        String res="";
        res+="/";

        for(int i=0;i<str.length();i++){
           String dir="";

            while(i<str.length() && str.charAt(i)=='/'){
          i++;
            }
            while(i<str.length() && str.charAt(i)!='/'){
                dir+=str.charAt(i);
                i++;
            }

            if(dir.equals("..")==true){
                if(!st.isEmpty()) st.pop();
            }
            else if(dir.equals(".")==true)
                continue;

            else if (dir.length()!=0)
                st.push(dir);
        }

        Stack<String>st1=new Stack<>();
        while(!st.isEmpty()){
st1.push(st.pop());
        }
        while(!st1.isEmpty()){
            if(st1.size()!=1){
                res+=(st1.pop()+"/");
            }else{
                res+=st1.pop();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str=new String("/apnacollege/");
        String str1=new String("/a/..");
//        String res=;
        System.out.println(simplify(str));
        System.out.println(simplify(str1));
    }

}

