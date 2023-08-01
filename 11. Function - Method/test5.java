public class test5 {
    public static int sumOfDigit(int num) {

        int sum = 0;
        while (num != 0) {
            int lastdigit = num % 10;
            sum = sum + lastdigit;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigit(67));
    }
}
