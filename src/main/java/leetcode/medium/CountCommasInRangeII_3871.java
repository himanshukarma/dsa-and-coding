package leetcode.medium;

public class CountCommasInRangeII_3871 {
    public static void main(String[] args) {
        System.out.println(countCommas(10000)); // Output: 1001
        System.out.println(countCommas(5001500));  // Output: 501
    }

    public static long countCommas(long n) {
        if (n <= 999) return 0;

        long totalCommas = 0;
        long rangeStart = 1000;
        long rangeEnd = rangeStart * 1000 - 1;
        int commas = 1;

        while (rangeStart <= n) {
            long numbers = Math.min(n, rangeEnd) - rangeStart + 1;
            totalCommas += (long) commas * numbers;

            if (rangeEnd > n) break;

            rangeStart = rangeStart * 1000;
            rangeEnd = rangeStart * 1000 - 1;
            commas++;
        }
        return totalCommas;
    }
}
