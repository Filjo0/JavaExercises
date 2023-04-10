package apps;

import java.util.Arrays;

public class InsertionSorter {
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int newElement = arr[i];
            int location = i - 1;

            while (location >= 0 && arr[location] > newElement) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = newElement;
        }
    }

    public static void main(String[] args) {
        int[][] data = {

                {}, {1}, {0, 3, 2, 1}, {4, 3, 2, 1, 0}, {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7},};

        double time = 0.0;

        long t1 = System.nanoTime();

        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " -> ");
            InsertionSorter.sort(arr);
            System.out.println(Arrays.toString(arr));
        }

        time = (System.nanoTime() - t1) / 1_000_000.0;
        System.out.println("A:" + time);


    }

}