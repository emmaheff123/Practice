import java.util.HashMap;

public int[] twoSum(int[] nums, int target) {
    int n = nums.length;
    for (int i = 0; i < n; i++){
        for (int j = i + 1; j < n; j++) {
            if (nums[i] + nums[j] == target){
                return new int[]{i, j};
            }
        }
    }
    return new int[]{};
}


public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> numMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (numMap.containsKey(complement)) {
            return new int[]{numMap.get(complement), i}; // Found the pair
        }
        numMap.put(nums[i], i); // Store index of the current number
    }
    return new int[]{}; // No solution found
}
