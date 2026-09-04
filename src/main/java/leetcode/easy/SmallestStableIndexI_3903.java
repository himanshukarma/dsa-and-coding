package leetcode.easy;

public class SmallestStableIndexI_3903 {
    public static void main(String[] args) {
        int[] nums = { 5, 0, 1, 4 };
        int k = 3;
        System.out.println(firstStableIndex(nums, k));
    }

    public static int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] suffix = new int[n];

        int mn = Integer.MAX_VALUE;
        // Build suffix minimum
        for (int i = n - 1; i >= 0; i--) {
            mn = Math.min(mn, nums[i]);
            suffix[i] = mn;
        }

        int mx = 0;
        // Find first index with score <= k
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, nums[i]);
            int score = mx - suffix[i];
            if (score <= k)
                return i;
        }

        return -1;
    }
}
