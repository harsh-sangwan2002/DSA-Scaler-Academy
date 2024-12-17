public class swap {

    public static void Swap(int[] temp1, int[] temp2) {

        int[] temp = temp1;
        temp1 = temp2;
        temp2 = temp;
    }

    public static void main(String... args) {

        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 6, 7, 8, 9, 10 };

        Swap(arr1, arr2);

        for (int val : arr1)
            System.out.println(val);

        System.out.println("------------------");

        for (int val : arr2)
            System.out.println(val);
    }
}