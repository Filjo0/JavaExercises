package apps;

import java.util.Arrays;

public class Permutation {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        permutation(arr, 0);
    }

    private static void permutation(int[] arr, int i) {
        if (i == arr.length - 1) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int k = i; k < arr.length; k++) {

                swap(arr, i, k);

                permutation(arr, i + 1);

                swap(arr, i, k);

            }
        }
    }

    private static void swap(int[] arr, int index0, int index1) {
        int tmp = arr[index0];
        arr[index0] = arr[index1];
        arr[index1] = tmp;
    }
}
