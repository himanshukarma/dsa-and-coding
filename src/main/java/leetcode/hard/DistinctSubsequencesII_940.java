package leetcode.hard;

public class DistinctSubsequencesII_940 {

    public static void main(String[] args) {
        System.out.println(distinctSubseqII("abc")); // Output: 7
        System.out.println(distinctSubseqII("aba")); // Output: 6
        System.out.println(distinctSubseqII("aaa")); // Output: 3
    }

    public static int distinctSubseqII(String s) {
        int mod = 1_000_000_007;
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1; // Empty subsequence

        int[] last = new int[26]; // To store the last occurrence of each character
        for (int i = 1; i <= n; i++) {
            char c = s.charAt(i - 1);
            dp[i] = (2 * dp[i - 1]) % mod;

            if (last[c - 'a'] > 0) {
                dp[i] = (dp[i] - dp[last[c - 'a'] - 1] + mod) % mod;
            }
            last[c - 'a'] = i;
        }

        return (dp[n] - 1 + mod) % mod; // Subtract the empty subsequence
    }
}