package leetcode.easy;

/**
 * CheckDivisibilityByDigitSumAndProduct
 * 
 * https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/description/?envType=daily-question&envId=2026-08-22
 * 
 * Runtime: 0ms
 * Memory: 42.37MB
 */
public class CheckDivisibilityByDigitSumAndProduct {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(checkDivisibility(n));
    }

    public static boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int digit = n;

        while (n > 0) {
            sum += n % 10;
            product *= n % 10;
            System.out.println("sum: " + sum + " product: " + product);
            n /= 10;
        }

        return digit % (sum + product) == 0;
    }
}
