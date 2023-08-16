import java.util.Scanner;

public class swap {
    public static void swapNumber(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Num1 is " + a);
        System.out.println("Num2 is " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = sc.nextInt();
        System.out.println("Num1 is " + num1);
        int num2 = sc.nextInt();
        System.out.println("Num2 is " + num2);

        swapNumber(num1, num2);
        sc.close();
    }
}
