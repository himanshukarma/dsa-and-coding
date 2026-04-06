package leetcode;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/walking-robot-simulation/description/?envType=daily-question&envId=2026-04-06
class WalkingRobotSimulation_874 {
    public static void main(String[] args) {
//        Example 1
        int[] commands = {4,-1,3};
        int[][] obstacles = {};

//        Exampe 2
//        int[] commands = {4,-1,4,-2,4};
//        int[][] obstacles = {{2,4}};

//        Example 3
//        int[] commands = {6,-1,-1,6};
//        int[][] obstacles = {};

        System.out.println("Answer : " + robotSim(commands, obstacles));
    }

    public static int robotSim(int[] commands, int[][] obstacles) {
        Set<String> set = new HashSet<>();
        for (int[] obs : obstacles) {
            set.add(obs[0] + "," + obs[1]);
        }

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int x = 0, y = 0;   // current position
        int dir = 0;        // facing north
        int maxDist = 0;

        for (int cmd : commands) {
            if (cmd == -2) {
                dir = (dir + 3) % 4;
            } else if (cmd == -1) {
                dir = (dir + 1) % 4;
            } else {
                for (int i = 0; i < cmd; i++) {
                    int nx = x + dx[dir];
                    int ny = y + dy[dir];

                    if (set.contains(nx + "," + ny)) {
                        break;
                    }

                    x = nx;
                    y = ny;

                    maxDist = Math.max(maxDist, x * x + y * y);
                }
            }
        }

        return maxDist;
    }
}