
public class linear_serch {

    public static int search(int string[], int key) {
        for (int i = 0; i < string.length; i++) {
            if (string[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        // int no[] = { 2, 4, 7, 8, 10, 34 };
        int string[] = { "dosa", "idli", "pizza", "burger", "maggi" };
        int key = "pizza";
        int index = search(string, key);
        if (index == -1) {
            System.out.println("key not found");

        } else {
            System.out.println("the key is  at index: " + index);
        }
    }
}
