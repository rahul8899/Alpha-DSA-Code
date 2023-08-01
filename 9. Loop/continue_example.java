import java.util.Scanner;

public class continue_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter you number : ");
            int number = sc.nextInt();
            if (number % 10 == 0) {
                continue;
            }
            System.out.println(number);
        } while (true);
    }
}