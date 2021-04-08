import java.util.Scanner;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        int WGP = 6000;
        double estimatedPopulation1 = 0.5;
        double estimatedPopulation2 = 0.4;
        double estimatedPopulation3 = 0.9;
        double estimatedPopulation4 = 0.7;
double  yearOnePop =(WGP * estimatedPopulation1) + WGP;
        System.out.println("Year One Population growth is " + " " + yearOnePop);
        double yearTwoPop =(yearOnePop * estimatedPopulation2) + yearOnePop;
        System.out.println("Year Two Population growth is " + " " + yearTwoPop);
        double yearThreePop= (yearTwoPop * estimatedPopulation3) + yearTwoPop;
        System.out.println("Year Three Population growth is " + " " + yearThreePop);
        double yearFourPop= (yearThreePop * estimatedPopulation4) + yearThreePop;
        System.out.println("Year Four Population growth is " + " " + yearFourPop);
        double yearFivePop = (yearFourPop * estimatedPopulation4) + yearFourPop;
        System.out.println("Year Five Population growth is" + " " + yearFivePop);


    }
}
