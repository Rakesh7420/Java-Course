public class q2_chars {
final static char[][] L={{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
    public static void letterCombinations(String D) {
//base case
        int len = D.length();
        if (len == 0) {
            System.out.println("");
            return;
        }
        work(0,len,new StringBuilder(),D);
    }

    public static void work(int pos,int len,StringBuilder sb, String D){
    if(pos==len){
        System.out.print(sb.toString());
    }else{
        char letters[]=L[Character.getNumericValue(D.charAt(pos))];
        for(int i=0;i< letters.length;i++){
            work(pos+1,len,new StringBuilder(sb).append(letters[i]+" "),D);
        }
    }

    }

    public static void main(String[] args) {
        letterCombinations("2");
        System.out.println();
        letterCombinations("23");
        System.out.println();
        letterCombinations("");
        System.out.println();
    }
}
