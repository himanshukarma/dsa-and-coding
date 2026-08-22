package leetcode.easy;

public class CheckDivisibilityByDigitSumAndProduct {
    public static void main(String[] args) {
        int n = 23;
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

        boolean result = ((sum + product) % digit == 0) ? true : false;

        return result;
    }
}
