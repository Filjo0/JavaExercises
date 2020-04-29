package apps;

import java.util.Arrays;

public class BubbleSorter {

    public static int[] sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length; barrier++) {
            for (int index = 0; index < arr.length - barrier - 1; index++) {
                if (arr[index] > arr[index + 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void Test() {
        // CALL
        int[] arr = {6, 3, 8, 9, 2, 1};
        int[] bubbleSorter = BubbleSorter.sort(arr);
        // CHECK
        String expectedStr = "[1, 2, 3, 6, 8, 9]";
        String actualStr = toString(bubbleSorter);
        if (!expectedStr.equals(actualStr)) {
            throw new AssertionError("Error in your Test. Expected = " + expectedStr + " but actual = " + actualStr);
        }

        System.out.print("Success. Test was finished correctly.");
    }

    private static String toString(int[] bubbleSorter) {
        return Arrays.toString(bubbleSorter);
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 8, 9, 2, 1};
        System.out.println(Arrays.toString(arr));
        BubbleSorter.sort(arr);
        System.out.println(Arrays.toString(arr));

        Test();
    }
}