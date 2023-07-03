package Hashmaps;
import java.util.HashMap;
import java.util.Map;

public class SumIndices {
    public static int[] findTwoSumIndices(int[] nums, int target){
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(nums[i], i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 50, 60 };
        int target = 100;

        int[] indices = findTwoSumIndices(nums, target);

        if (indices.length == 2) {
            System.out.println("[" + indices[0] + "," + indices[1] + "]");
        } else {
            System.out.println("No two elements sum up to the target.");
        }
    }
}
