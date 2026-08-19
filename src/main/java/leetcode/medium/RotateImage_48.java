package leetcode.medium;

public class RotateImage_48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int n = mat.length, k = n - 1;
		for (int i = 0; i < n >> 1; i++)
			for (int j = i; j < k - i; j++) {
				int t = mat[i][j];
				mat[i][j] = mat[k - j][i];
				mat[k - j][i] = mat[k - i][k - j];
				mat[k - i][k - j] = mat[j][k - i];
				mat[j][k - i] = t;
			}
	}

	public void rotate(int[][] matrix) {

	}
}
