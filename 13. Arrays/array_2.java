import java.util.Scanner;

public class array_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[10];
        marks[0] = 12;
        marks[1] = 45;

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        System.out.println(marks[1]);
        sc.close();
    }
}
