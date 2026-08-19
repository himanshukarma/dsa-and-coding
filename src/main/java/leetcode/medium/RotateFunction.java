package leetcode.medium;

public class RotateFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 3, 2, 6 };
		System.out.println("Result : " + maxRotateFunction(nums));
	}

	public static int maxRotateFunction(int[] nums) {

		int sum = 0, F = 0;
		int n = nums.length;

		for (int i = 0; i < n; i++) {
			sum += nums[i];
			F += i * nums[i];
		}

		int max = F;

		for (int i = 1; i < n; i++) {
			F += sum - n * nums[n - i];
			max = Math.max(max, F);
		}

		return max;
	}
}
