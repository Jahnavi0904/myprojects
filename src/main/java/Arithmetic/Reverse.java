package Arithmetic;

import java.util.Arrays;

public class Reverse {

    static int[] reverse(int arr[], int n) {
        int temp[] = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            temp[j - 1] = arr[i];
            j = j - 1;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] numbers = {9, 6, 5, 8, 89, 7, 10, 12};
        int[] reversedArray = reverse(numbers, numbers.length);
        System.out.println("Reversed Array:"+ Arrays.toString(reversedArray));
    }
}
