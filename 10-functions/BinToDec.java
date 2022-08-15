public class BinToDec {
    public static void bin_to_dec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int dec_Num = 0;
        while (binNum > 0) {
            int LastDigit = binNum % 2;
            dec_Num = dec_Num + (LastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of " + myNum + " = " + dec_Num);
    }

    public static void main(String args[]) {
        bin_to_dec(1010);
    }
}
