package Chapter6;

import java.util.Scanner;

public class Distance {

    public static double calculateDistance(int x1,int y1,int x2,int y2) {
        double distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1 )* (y2-y1));
        return distance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1");
        int x1 = scanner.nextInt();
        System.out.println("Enter x2");
        int x2 = scanner.nextInt();
        System.out.println("Enter y1");
        int y1 = scanner.nextInt();
        System.out.println("Enter y2");
        int y2 = scanner.nextInt();

        System.out.println("The Distance between " +x1  +" to "+ x2 +" and "+ y1+ " to"+ " "+ y2 +" is "+calculateDistance(x1,y1,x2,y2));
    }

}
