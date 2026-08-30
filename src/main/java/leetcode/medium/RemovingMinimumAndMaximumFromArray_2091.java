package leetcode.medium;

public class RemovingMinimumAndMaximumFromArray_2091 {
    public static void main(String[] args) {
        int[] nums = {2, 10, 7, 5, 4, 1, 8, 6};
        System.out.println(minimumDeletions(nums));
    }

    public static int minimumDeletions(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[left])
                left = i;
                
            if (nums[i] > nums[right])
                right = i;
        }
        
        if (left < right) {
            int temp = left;
            left = right;
            right = temp;
        }
            
        int ans = n;
        
        for (int i = 0; i <= n; i++) {
            int extra = 0;
            
            if (right >= i)
                extra = n - right;
            else if (left >= i)
                extra = n - left;
                
            ans = Math.min(ans, i + extra);
        }
        
        return ans;
    }
}
