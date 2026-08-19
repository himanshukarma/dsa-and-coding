package leetcode.easy;

public class RotateString_796 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcde";
		String goal = "cdeab";
		System.out.println("Result : " + rotateString(s, goal));
	}

	public static boolean rotateString(String s, String goal) {

		if (s.length() != goal.length())
			return false;

		return (s + s).contains(goal);

	}

}
