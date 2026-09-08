package leetcode.easy;

public class CountCommasInRage_3870 {
    public static void main(String[] args) {
        System.out.println(countCommas(1009)); // Output: 1
        System.out.println(countCommas(999));  // Output: 0
    }

    public static int countCommas(int n) {
        return (n > 999) ? (n - 999) : 0;
    }
}