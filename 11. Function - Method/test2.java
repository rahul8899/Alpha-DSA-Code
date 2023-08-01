import java.util.Scanner;

public class test2 {

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a num");
            int n = sc.nextInt();

            if (isEven(n)) {
                System.out.println("Number is even ");
            } else {
                System.out.println("Number is not even ");

            }
        }
    }
}
