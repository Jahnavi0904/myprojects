package june6th;

public class Leftshift {

    static int[] rotate(int arr[], int n, int position) {
        int temp[] = new int[position];
        for (int i = 0; i < position; i++) {
            temp[i] = arr[i];
        }
        for (int i = position; i < n; i++) {
            arr[i - position] = arr[i];
        }
        for (int i = n - position; i < n; i++) {
            arr[i] = temp[i - (n - position)];
        }
        return arr;
    }


    public static void main(String[] args) {
        int position = 3;
        int[] numbers = {9, 6, 5, 8, 89, 7, 10, 12};
        int[] rotatededArray = rotate(numbers, numbers.length, position);
        System.out.println("Rotated Array:");
        for (int num : rotatededArray) {
            System.out.print(num + " ");
        }
    }
}
