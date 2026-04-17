package leetcode;

import java.util.Set;
import java.util.TreeSet;

/**
 * https://leetcode.com/problems/minimum-absolute-distance-between-mirror-pairs/?envType=daily-question&envId=2026-04-17
 */
public class MinimumAbsoluteDistanceBetweenMirrorPairs_3761 {

    public static void main(String[] args) {
        int[] nums = {7, 5, 9, 5, 7};

        System.out.println("Result : " + minMirrorPairDistance(nums));
    }

    public static int minMirrorPairDistance(int[] nums) {
        Set<Integer> seen = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            int rev = reverseNumber(nums[i]);
            for (int j = i + 1; j < nums.length; j++) {
                if (rev == nums[j]) {
                    seen.add(Math.abs(i - j));
                }
            }
        }

        if (seen.size() > 0) {
            return seen.stream().iterator().next();
        }

        return -1;
    }

    public static int reverseNumber(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
}
