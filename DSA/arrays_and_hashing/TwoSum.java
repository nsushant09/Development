package DSA.arrays_and_hashing;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            hashMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++){
            if(hashMap.containsKey(target - nums[i])){
                int newIndex = hashMap.get(target - nums[i]);
                if(i != newIndex)
                    return new int[]{i, hashMap.get(target - nums[i])};
            }
        }

        return new int[] {-1, -1};
    }
}
