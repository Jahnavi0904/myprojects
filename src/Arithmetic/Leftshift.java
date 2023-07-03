package Arithmetic;

import java.util.Arrays;

public class Leftshift {

    static int[] rotate(int arr[], int n, int y) {
        int temp[] = new int[y];
        for (int i = 0; i < y; i++) {
            temp[i] = arr[i];
        }
        for (int i = y; i < n; i++) {
            arr[i - y] = arr[i];
        }
        for (int i = n - y; i < n; i++) {
            arr[i] = temp[i - (n - y)];
        }
        return arr;
    }


    public static void main(String[] args) {
        int position = 3;
        int[] numbers = {9, 6, 5, 8, 89, 7, 10, 12};
        int[] rotatededArray = rotate(numbers, numbers.length, position);
        System.out.println("Rotated Array:"+ Arrays.toString(rotatededArray));
    }
}
