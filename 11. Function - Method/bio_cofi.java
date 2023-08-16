import java.util.Scanner;

public class bio_cofi {

    public static int fact(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i;
        }
        return f;
    }

    public static int bio_coficient(int n, int r) {
        int a = fact(n);
        int b = fact(r);
        int c = fact(n - r);

        int result = a / (b * c);

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number for find bio_cofisient");
        System.out.println("Enter n ");
        int num_1 = sc.nextInt();
        System.out.println("Enter r ");
        int num_2 = sc.nextInt();

        System.out.println("Your ans is " + bio_coficient(num_1, num_2));
        sc.close();
    }
}
