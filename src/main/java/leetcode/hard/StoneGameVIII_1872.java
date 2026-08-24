package leetcode.hard;

/**
 * StoneGameVIII_1872
 * 
 * https://leetcode.com/problems/stone-game-viii/description/
 * 
 * Runtime - 3ms
 * Memory - 83.3MB
 */
public class StoneGameVIII_1872 {
    public static void main(String[] args) {
        int[] stones = {7, -6, 9, -3, -2};
        System.out.println(stoneGameVIII(stones));
    }

    public static int stoneGameVIII(int[] stones) {
        int n = stones.length;
        for (int i = 1; i < n; i++)
            stones[i] += stones[i - 1];

        int ans = stones[n - 1];
        for (int i = n - 2; i > 0; i--)
            ans = Math.max(ans, stones[i] - ans);

        return ans;
    }
}
