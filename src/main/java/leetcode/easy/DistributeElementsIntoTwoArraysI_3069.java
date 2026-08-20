package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * https://leetcode.com/problems/distribute-elements-into-two-arrays-i/?envType=daily-question&envId=2026-08-20
 * 
 * Topics -
 * Array
 * Simulation
 * 
 * Runtime: 2ms
 */
public class DistributeElementsIntoTwoArraysI_3069 {
    public static void main(String[] args) {
        int[] nums = { 5, 4, 3, 8 };
        System.out.println(Arrays.toString(resultArray(nums)));
    }

    public static int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for (int i = 2; i < nums.length; i++) {
            if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }

        int[] result = new int[nums.length];
        int k = 0;

        for (int x : arr1) {
            result[k++] = x;
        }

        for (int x : arr2) {
            result[k++] = x;
        }

        return result;
    }
}