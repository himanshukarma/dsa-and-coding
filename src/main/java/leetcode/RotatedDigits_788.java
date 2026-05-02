package leetcode;

public class RotatedDigits_788 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Result : " + rotatedDigits(10));
	}

	public static int rotatedDigits(int n) {
		int result = 0;

		for (int i = 1; i <= n; i++) {
			int num = i;
			boolean isValid = true;
			boolean isChanged = false;
			while (num > 0) {

				int temp = num % 10;

				if (temp == 3 || temp == 4 || temp == 7) {
					isValid = false;
					break;
				}

				if (temp == 2 || temp == 5 || temp == 6 || temp == 9) {
					isChanged = true;
				}

				num /= 10;
			}

			if (isValid && isChanged)
				result++;
		}

		return result;
	}
}
