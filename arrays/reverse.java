package arrays;

public class reverse {

    public static int swap(int numbers[]) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;
            start++;
            end--;
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 15, 4, 6, 8, 10 };
        swap(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
