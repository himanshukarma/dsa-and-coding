package leetcode;

public class FurthestPointFromOrigin_2833 {
    public static void main(String[] args) {
        String moves = "L_RL__R___";
        System.out.println(("Result : " + furthestDistanceFromOrigin(moves)));
    }

    public static int furthestDistanceFromOrigin(String moves) {

        int left = 0, right = 0, count = 0;

        for(char c : moves.toCharArray()) {
            if(c == 'L') left++;
            else if(c == 'R') right++;
            else count++;
        }

        return Math.abs(left - right) + count;
    }
}
