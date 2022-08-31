package arrays;

public class binary_search {

    public static int binary(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            } else if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = end - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10, 12 };
        int key = 10;
        // System.out.print("fhgj");
        System.out.println("the lraget number is at index: " + binary(numbers, key));
    }
    // System.out.println()
}
