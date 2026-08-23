package leetcode.medium;

public class SumGame_1927 {
    public static void main(String[] args) {
        String num = "5?0293??";
        System.out.println(sumGame(num));
    }

    public static boolean sumGame(String num) {
        int len = num.length(), halfLen = len / 2;
        int sum1 = 0, sum2 = 0, count1 = 0, count2 = 0;

        for (int i = 0; i < halfLen; i++) {
            if (num.charAt(i) == '?') {
                count1++;
            } else {
                sum1 += num.charAt(i) - '0';
            }
        }

        for (int i = halfLen; i < len; i++) {
            if (num.charAt(i) == '?') {
                count2++;
            } else {
                sum2 += num.charAt(i) - '0';
            }
        }

        int totalCountQ = count1 + count2;
        if (totalCountQ % 2 == 1)
            return true;

        return 2 * (sum1 - sum2) != 9 * (count2 - count1);
    }
}
