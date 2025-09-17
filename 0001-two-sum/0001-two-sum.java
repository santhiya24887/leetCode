import java.util.HashMap;
import java.util.Map;

class Solution {

    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] indices = twoSum(numbers, target);

        if (indices[0] != -1) {
            System.out.println("Indices of elements that sum to " + target + ": " + indices[0] + ", " + indices[1]);
        } else {
            System.out.println("No two elements found that sum to " + target);
        }
    }
}