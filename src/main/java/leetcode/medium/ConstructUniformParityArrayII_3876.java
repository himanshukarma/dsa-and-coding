package leetcode.medium;

public class ConstructUniformParityArrayII_3876 {
    public static void main(String[] args) {
        System.out.println(uniformArray(new int[] { 2, 4 }));
    }

    public static boolean uniformArray(int[] A) {
        int min = A[0], odd = 0;

        for (int x : A) {
            min = Math.min(min, x);
            odd |= x & 1;
        }

        return (min & 1) == odd;
    }
}
