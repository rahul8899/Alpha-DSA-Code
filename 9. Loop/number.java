import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int i = 1;
        while (i <= range) {
            System.out.print(i + " ");
            i++;
        }
    }
}
