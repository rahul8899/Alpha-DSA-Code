public class array_6Max_Min {

    public static int largetsNumber(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest Number of array elements is :" + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 10, 4, 5, 6 };
        System.out.println("Largest Number of array elements is :" + largetsNumber(number));
    }
}
