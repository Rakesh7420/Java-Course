public class largest {

    public static int get_largest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("the smallest number is: " + smallest);
        return largest;

    }

    public static void main(String args[]) {
        int numbers[] = { 1, 5, 2, 6, 3, 5 };
        System.out.println("the largest number is: " + get_largest(numbers));

    }
}