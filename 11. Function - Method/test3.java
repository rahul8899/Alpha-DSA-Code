import java.util.*;

public class test3 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a num");
            int n = sc.nextInt();

            if (isPallindrom(n)) {
                System.out.println("Num is pallindrom");
            } else {
                System.out.println("Num is not pallindrom");
            }
        }
    }

    public static boolean isPallindrom(int num) {
        int numNext = num;
        int reverse = 0;

        while (numNext != 0) {
            int lastdigit = numNext % 10;
            reverse = reverse * 10 + lastdigit;
            numNext = numNext / 10;
        }

        if (num == reverse) {
            return true;
        }
        return false;

    }

}
