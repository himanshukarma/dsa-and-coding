package leetcode.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/distribute-elements-into-two-arrays-i/?envType=daily-question&envId=2026-08-20
 * 
 * Topics -
 * Array
 * Simulation
 */
public class DistributeElementsIntoTwoArraysI_3069 {
    public static void main(String[] args) {
        int[] nums = { 5, 4, 3 };
        System.out.println(Arrays.toString(resultArray(nums)));
    }

    public static int[] resultArray(int[] nums) {
        int[] arr1 = new int[nums.length / 2];
        int[] arr2 = new int[nums.length / 2];

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                arr1[i / 2] = nums[i];
            } else {
                arr2[i / 2] = nums[i];
            }
        }

        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

        return result;
    }
}