public class dec_to_bin {
    public static void decToBin(int decNum) {
        int myNum = decNum;
        int pow = 0;
        int binNUm = 0;

        while (decNum > 0) {
            int lastDigit = decNum % 2;
            binNUm = binNUm + (lastDigit * (int)Math.pow(10, pow));

            pow++;
            decNum = decNum / 2;

        }
        System.out.println("Bin of my num "+myNum+" is "+binNUm);
    }

    public static void main(String[] args) {
        decToBin(45);
    }
}
