package somWork.m2;

public class Stairs {
    public static int climbStairs(int stairSteps) {
        if (stairSteps <= 1) {
            return 1;
        }

        int[] ways = new int[stairSteps + 1];
        ways[0] = 1;
        ways[1] = 1;

        for (int i = 2; i <= stairSteps; i++) {
            ways[i] = ways[i - 2] + ways[i - 1];
        }

        return ways[stairSteps];
    }

    public static void main(String[] args) {
        System.out.println("you have " + climbStairs(4)+
                " possible ways of climbing the stairs" );
        String print = "Hi";
        int num = 5;
        System.out.printf("%s%2d",print,num);
    }
}
