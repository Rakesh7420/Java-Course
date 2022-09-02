import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str1="earth";
        String str2="heart";
        //converting str to lowercase so that there will be no need to compare uppercase and lowercase
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()==str2.length()){
            //if  this condition satisfies then convert str to charArray
            char[] str1charArray= str1.toCharArray();
            char[] str2charArray= str2.toCharArray();
            //after converting to charArray, sort it
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            // now compare both Arrays
            boolean result=Arrays.equals(str1charArray, str2charArray);
                if(result){
                    System.out.println(str1+" and "+str2+" are anagrams of each other . ");
                }
                else{
                    System.out.println(str1+" and "+str2+" are not anagrams of each other . ");
                }
            }
            else{
   
                       System.out.println(str1+" and "+str2+" are not anagrams of each other . ");
                   }
        }
    }

