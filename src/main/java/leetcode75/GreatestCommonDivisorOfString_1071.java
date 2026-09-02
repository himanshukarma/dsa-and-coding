package leetcode75;

public class GreatestCommonDivisorOfString_1071 {
    public static void main(String[] args) {
        String str1 = "ABCABC", str2 = "ABC";
        System.out.println(gcdOfStrings(str1, str2));
    }

    public static String gcdOfStrings(String str1, String str2) {
        // Step 1: Check if a common pattern exists
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Step 2: Find GCD of the lengths
        int length = gcd(str1.length(), str2.length());

        // Step 3: Return prefix of that length
        return str1.substring(0, length);
    }

    private static int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
