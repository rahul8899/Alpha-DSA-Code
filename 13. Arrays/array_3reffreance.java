public class array_3reffreance {
    public static void update(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 98, 74, 58, 45, 26 };
        // System.out.println(marks[2]);
        update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        // System.out.println(marks[2]);
    }
}
