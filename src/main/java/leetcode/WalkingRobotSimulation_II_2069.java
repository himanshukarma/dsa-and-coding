package leetcode;

/**
 * https://leetcode.com/problems/walking-robot-simulation-ii/description/?envType=daily-question&envId=2026-04-07
 */
public class WalkingRobotSimulation_II_2069 {
    public int[][] position;
    public String[] direction;
    int currentIndex = 0;
    int permiter;
    boolean moved = false;


    public WalkingRobotSimulation_II_2069(int width, int height) {
        permiter = 2 * (width + height) - 4;
        position = new int[permiter][2];
        direction = new String[permiter];

        int index = 0;

        //East
        for (int i = 0; i < width; i++) {
            position[index] = new int[]{i, 0};
            direction[index] = "East";
            index++;
        }

        //North
        for (int i = 1; i < height; i++) {
            position[index] = new int[]{width - 1, i};
            direction[index] = "North";
            index++;
        }

        //West
        for (int i = width - 2; i >= 0; i--) {
            position[index] = new int[]{i, height - 1};
            direction[index] = "West";
            index++;
        }

        //South
        for (int i = height - 2; i > 0; i--) {
            position[index] = new int[]{0, i};
            direction[index] = "South";
            index++;
        }

        direction[0] = "South";
    }

    public static void main(String[] args) {
        System.out.println("Walking Robot Simulation II");

        WalkingRobotSimulation_II_2069 robot = new WalkingRobotSimulation_II_2069(6, 3);
        robot.step(2);
        System.out.println(robot.getPos()[0] + " " + robot.getPos()[1] + " " + robot.getDir());
        robot.step(2);
        System.out.println(robot.getPos()[0] + " " + robot.getPos()[1] + " " + robot.getDir());
        robot.step(2);
        System.out.println(robot.getPos()[0] + " " + robot.getPos()[1] + " " + robot.getDir());
        robot.step(1);
        System.out.println(robot.getPos()[0] + " " + robot.getPos()[1] + " " + robot.getDir());
    }

    public void step(int num) {
        moved = true;
        currentIndex = (currentIndex + num) % permiter;
    }

    public int[] getPos() {
        return position[currentIndex];
    }

    public String getDir() {
        if (!moved && currentIndex == 0) {
            return "East";
        }
        return direction[currentIndex];
    }

}
