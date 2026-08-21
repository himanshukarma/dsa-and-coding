package leetcode.hard;

import java.util.Arrays;

/**
 * 
 * KthSmallestAmountWithSingleDenominationCombination_3116
 * 
 * https://leetcode.com/problems/kth-smallest-amount-with-single-denomination-combination/submissions/2115421265/?envType=daily-question&envId=2026-08-21
 * 
 * Runtime 11ms
 */
public class KthSmallestAmountWithSingleDenominationCombination_3116 {
    public static void main(String[] args) {
        int[] coins = {3, 6, 9};
        int k = 3;
        System.out.println(findKthSmallest(coins, k));
    }

    public static long findKthSmallest(int[] coins, int k) {
        Arrays.sort(coins);

        int[] filteredCoins = new int[coins.length];
        int coinCount = 0;

        for (int coin : coins) {
            boolean redundant = false;

            for (int index = 0; index < coinCount; index++) {
                if (coin % filteredCoins[index] == 0) {
                    redundant = true;
                    break;
                }
            }

            if(!redundant) {
                filteredCoins[coinCount++] = coin;
            }
        }

        long lowerBound = 1;
        long upperBound = (long) filteredCoins[0] * k;

        while (lowerBound < upperBound) {
            long middle = lowerBound + (upperBound - lowerBound) / 2;

            if (countAmountsAtMost(middle, filteredCoins, coinCount) >= k) {
                upperBound = middle;
            } else {
                lowerBound = middle + 1;
            }
        }

        return lowerBound;
    }

    private static long countAmountsAtMost(long amount, int[] coins, int coinCount) {
        long count = 0;
        int subsetCount = 1 << coinCount;

        for (int mask = 1; mask < subsetCount; mask++) {
            long leastCommonMultiple = 1;
            int selectedCoinCount = 0;
            boolean exceedsAmount = false;

            for (int index = 0; index < coinCount; index++) {
                if ((mask & (1 << index)) == 0) {
                    continue;
                }

                selectedCoinCount++;
                long divisor = gcd(leastCommonMultiple, coins[index]);
                leastCommonMultiple = leastCommonMultiple / divisor * coins[index];

                if (leastCommonMultiple > amount) {
                    exceedsAmount = true;
                    break;
                }
            }

            if (!exceedsAmount) {
                long multiples = amount / leastCommonMultiple;
                count += selectedCoinCount % 2 == 1 ? multiples : -multiples;
            }
        }

        return count;
    }

    private static long gcd(long first, long second) {
        while (second != 0) {
            long remainder = first % second;
            first = second;
            second = remainder;
        }
        return first;
    }
}
