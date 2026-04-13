package leetcode;

public class MinimumDistanceToTheTargetElement_1848 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 5;
        int start = 3;

        System.out.println(getMinDistance(nums, target, start)); // Output: 1
    }

    public static int getMinDistance(int[] nums, int target, int start) {

        for (int i = 0; i < nums.length; i++) {
            if (start - i >= 0 && nums[start - i] == target) {
                return i;
            }
            if (start + i < nums.length && nums[start + i] == target) {
                return i;
            }
        }

        return 0;
    }
}
