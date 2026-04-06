package leetcode;

public class RobotReturnToOrigin_657 {
    public static void main(String[] args) {
        String moves = "UD";

        System.out.print("Answer : " + judgeCiricleSwtich(moves));
    }

    public static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for(int index =0; index < moves.length(); index++){
            char move = moves.charAt(index);

            if(move == 'U') y++;
            else if(move == 'D') y--;
            else if(move == 'L') x--;
            else if(move == 'R') x++;
        }


        return (x == 0 && y ==0);
    }

    public static boolean judgeCiricleSwtich(String moves) {
        int x = 0;
        int y = 0;

        for(char ch : moves.toCharArray()) {
            switch (ch) {
                case 'U': y++; break;
                case 'D': y--; break;
                case 'L': x--; break;
                case 'R': x++; break;
            }
        }

        return x==0 & y==0;
    }
}
