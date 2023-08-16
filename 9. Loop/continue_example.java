import java.util.Scanner;

public class continue_example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter your number (enter -1 to exit): ");
            int number = scanner.nextInt();

            if (number == -1) {
                break; // Exit the loop if -1 is entered
            }

            if (number % 10 == 0) {
                continue;
            }
            System.out.println(number);
        } while (true);

        // Close the scanner when done
        scanner.close();
    }
}