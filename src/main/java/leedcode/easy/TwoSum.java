package leedcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * Example:
     * Given nums = [2, 7, 11, 15], target = 9,
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     */

    public static void main(String[] args) {
        int[] nums = {15,2,7,11};
        System.out.println(Arrays.toString(new TwoSum().getTargetIndex(nums, 9)));
    }

    private int[] getTargetIndex(int[] num, final int target) {
        if(num.length<=1){
            return new int[] {-1,-1};
        }

        Map<Integer, Integer> diffIndex = new HashMap<Integer, Integer>();

        for (int index = 0; index < num.length; index++) {
            diffIndex.put(num[index], index);
            if (diffIndex.containsKey(num[index] - target)) {
                return new int[]{diffIndex.get(num[index] - target), index};
            }
        }
        return new int[] {-1,-1};
    }

}
