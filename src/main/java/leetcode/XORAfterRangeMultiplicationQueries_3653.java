package leetcode;

/**
 * LeetCode 3653. XOR After Range Multiplication Queries
 * <p>
 * https://leetcode.com/problems/xor-after-range-multiplication-queries-i/description/?envType=daily-question&envId=2026-04-08
 */
public class XORAfterRangeMultiplicationQueries_3653 {
    public static void main(String[] args) {
//        int[] nums = {1, 1, 1};
//        int[][] queries = {{0, 2, 1, 4}};

//        int[] nums = {2, 3, 1, 5, 4};
//        int[][] queries = {{1, 4, 2, 3}, {0, 2, 1, 2}};

        int[] nums = {780};
        int[][] queries = {{0, 0, 1, 13}, {0, 0, 1, 17}, {0, 0, 1, 9}, {0, 0, 1, 18}, {0, 0, 1, 16}, {0, 0, 1, 6},
                {0, 0, 1, 4}, {0, 0, 1, 11}, {0, 0, 1, 7}, {0, 0, 1, 18}, {0, 0, 1, 8}, {0, 0, 1, 15}, {0, 0, 1, 12}};

        System.out.println("Answer " + xorAfterQueries(nums, queries));
    }

    public static int xorAfterQueries(int[] nums, int[][] queries) {
        final int MOD = 1000000007;
        int result = 0;

        for (int[] query : queries) {
            int left = query[0];
            int right = query[1];
            int step = query[2];
            int mul = query[3];

            while (left <= right) {
                nums[left] = (int) ((long) nums[left] * mul % MOD);
                left += step;
            }
        }

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}
