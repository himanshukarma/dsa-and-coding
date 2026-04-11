package leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class MinimumDistanceBetweenThreeEqualElement1_3740 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        System.out.println("\nAnswer : " + minimumDistance(nums));
    }

    public static int minimumDistance(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();

        if (nums.length < 2) {
            return -1;
        }

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] == nums[j] && nums[j] == nums[k] && nums[i] == nums[k]) {
                        result.add(Math.abs(i - j)
                                + Math.abs(j - k)
                                + Math.abs(k - i));
                    }
                }
            }
        }

        System.out.print(result);

        if (result.size() > 0) {
            Collections.sort(result);
            return result.get(0);
        }

        return -1;
    }
}
