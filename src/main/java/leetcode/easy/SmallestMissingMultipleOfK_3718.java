package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * SmallestMissingMultipleOfK_3718
 * 
 * https://leetcode.com/problems/smallest-missing-multiple-of-k
 * 
 * Runtime - 2ms
 * Memory - 45.34 MB
 */
public class SmallestMissingMultipleOfK_3718 {
    public static void main(String[] args) {
        System.out.println(missingMultiple(new int[] { 8, 2, 3, 4, 6 }, 2)); // Output: 6
    }

    public static int missingMultiple(int[] nums, int k) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            seen.add(num);
        }

        int cur = k;
        while (seen.contains(cur)) {
            cur += k;
        }

        return cur;
    }
}
