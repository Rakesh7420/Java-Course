public class binarytodecimal {
    public static void main(String[] args) {
        bintodec(111);
    }

    public static void bintodec(int binNum) {
        int mynum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println(("Decimal of " + mynum + " = " + decNum));
    }
}
