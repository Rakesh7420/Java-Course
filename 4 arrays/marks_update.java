package arrays;

public class marks_update {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
            System.out.println(marks[i] + " ");
        }
    }

    public static void main(String[] args) {
        int marks[] = { 98, 84, 96, 76, 75 };
        update(marks);
    }
}
