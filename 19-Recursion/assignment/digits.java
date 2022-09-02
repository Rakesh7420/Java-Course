public class digits {
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void main(String[] args) {
        print_que2(1234);
        System.out.println();
    }

    public static void print_que2(int number){
        if(number==0){
            return;
        }
        int lastdigit=number%10;
       print_que2(number/10);
       System.out.print(digits[lastdigit]+" ");
    }
}
