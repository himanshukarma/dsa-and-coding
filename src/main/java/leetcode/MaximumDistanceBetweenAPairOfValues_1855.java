package leetcode;

public class MaximumDistanceBetweenAPairOfValues_1855 {
    public static void main(String[] args) {
        int[] nums1 = {55, 30, 5, 4, 2};
        int[] nums2 = {100, 20, 10, 10, 5};

        System.out.println("Result : " + maxDistance(nums1, nums2));
    }

    public static int maxDistance(int[] nums1, int[] nums2) {
        int result = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] <= nums2[j]) {
                    result = Math.max(result, j - i);
                }
            }
        }
        return result;
    }
}
