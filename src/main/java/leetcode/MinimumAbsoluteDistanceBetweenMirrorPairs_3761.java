package leetcode;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/minimum-absolute-distance-between-mirror-pairs/?envType=daily-question&envId=2026-04-17
 */
public class MinimumAbsoluteDistanceBetweenMirrorPairs_3761 {

    public static void main(String[] args) {
        int[] nums = {7, 5, 9, 5, 7};

        System.out.println("Result : " + minMirrorPairDistance(nums));
    }

    public static int minMirrorPairDistance(int[] nums) {
        int res = 100000, i = 0;
        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int n : nums) {
            int r;
            if (seen.containsKey(n))
                res = Math.min(res, i - seen.get(n));

            for (r = 0; n > 0; n /= 10)
                r = r * 10 + (n % 10);

            seen.put(r, i++);
        }

        return res == 100000 ? -1 : res;
    }
}
