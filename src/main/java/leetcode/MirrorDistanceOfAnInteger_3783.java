package leetcode;

public class MirrorDistanceOfAnInteger_3783 {
    public static void main(String[] args) {
        System.out.println("Result : " + mirrorDistance(123));
    }

    public static int mirrorDistance(int n) {

        return Math.abs(n - repeatNumber(n));
    }

    private static int repeatNumber(int n) {
        int result = 0;
        while (n > 0) {
            int digit = n % 10;
            result = result * 10 + digit;
            n /= 10;
        }
        return result;
    }
}
