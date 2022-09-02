public class duplicated {
    public static void main(String[] args) {
        String str="appnnacollege";
        remove_duplicate(0, str, new StringBuilder(""), new boolean[26]);
    }

    public static void remove_duplicate(int index,String str,StringBuilder newstr, boolean map[]){
        if(index==str.length()){
         System.out.println(newstr);
         return;
        }
        char currchar=str.charAt(index);
        if(map[currchar-'a']==true){
            remove_duplicate(index+1, str, newstr, map);
        }else{
            map[currchar-'a']=true;
            remove_duplicate(index+1, str, newstr.append(currchar), map);

        }
     
    }
}
