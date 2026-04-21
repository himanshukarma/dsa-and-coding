package leetcode;

public class TwoFurthestHousesWithDifferentColors_2078 {
    public static void main(String[] args) {
        System.out.println("Result : " + maxDistance(new int[]{1, 1, 1, 6, 1, 1, 1}));
    }

    public static int maxDistance(int[] colors) {

        int j = colors.length;

        for (int i = 0; i < j; i++)
            if (colors[i] != colors[j - 1] || colors[j - 1 - i] != colors[0])
                return j - 1 - i;

        return 0;
    }
}
