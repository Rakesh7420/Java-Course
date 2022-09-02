public class length_of_dtring {
    public static void main(String[] args) {
        String str="Gayatrri";
        System.out.println(que3(str));
    }

    public static int que3(String str){
        if(str.length()==0){
            return 0;
        }
        return que3(str.substring(1))+1;
    }
}
