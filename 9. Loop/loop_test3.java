import java.util.Scanner;

public class loop_test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        sc.close();
        System.out.println("Factorial of given number is " + fact);
    }
}
