import java.util.Scanner;

public class test1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scanner.nextInt();

        if (num >= 0) {
            System.out.println("Num is positive");
        } else {
            System.out.println("Num is negative");
        }
        scanner.close();
    }
}
