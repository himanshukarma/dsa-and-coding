package leetcode.medium;

public class RemovingMinimumAndMaximumFromArray_2091 {
    public static void main(String[] args) {
        int[] nums = {2, 10, 7, 5, 4, 1, 8, 6};
        System.out.println(minimumDeletions(nums));
    }

    public static int minimumDeletions(int[] nums) {
        int len = nums.length;

        if(len == 1) {
            return 1;
        
        }

        return 0;
    }
}
