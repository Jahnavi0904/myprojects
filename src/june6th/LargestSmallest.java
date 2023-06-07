package june6th;

public class LargestSmallest {
        public static int findMin (int[] arr){
            int max= arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]>max) {
                   max = arr[i];
                }
            }
            return max;
        }
        public static int findMax (int[] arr){
            int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]<min) {
                  min= arr[i];
                }
            }
            return min;
        }
    public static void main(String[] args) {
        int[] numbers = {9, 6, 5, 8, 89, 7, 9, 12};
        int max= findMin(numbers);
        int min= findMax(numbers);

        System.out.println("Largest:" +max);
        System.out.println("Smallest:" +min);
    }
    }
