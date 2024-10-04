import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int diff = 0;

        Map<Integer, Integer> arr = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            diff = target - nums[i];

            if (arr.containsKey(diff)) {
                return new int[]{i, arr.get(diff)};
            }

            arr.put(nums[i], i);
        }

        return new int[]{};

    }
}
