public class array_5LinerSearch {
    public static int linearSearch(int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int number[] = { 45, 78, 56, 85, 96, 35, 55, 25, 23 };
        int key = 23;

        int index = linearSearch(number, key);

        if (index == 0) {
            System.out.println("Number is not found");
        } else {
            System.out.println("Number is found at index : " + index);
        }
    }
}