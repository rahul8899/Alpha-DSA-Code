public class bio_to_dec {
    public static void bioToDec(int bioNum) {
        int myNum = bioNum;
        int decNum = 0;
        int pow = 0;

        while (bioNum > 0) {
            int lastDigit = bioNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            bioNum = bioNum / 10;
        }
        System.out.println("Dec bum of " + myNum + " is = " + decNum);
    }

    public static void main(String[] args) {
        bioToDec(101101);
    }
}
