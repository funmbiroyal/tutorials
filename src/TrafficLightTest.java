import java.util.EnumSet;

public class TrafficLightTest {
    public static void main(String[] args) {
        System.out.println("The Traffic light enums are :");
        for(TrafficLight trafficLight : TrafficLight.values())
            System.out.printf("%-25s%-20s%s%n" ,trafficLight ,trafficLight.getEnumConstant(),trafficLight.getDuration());
        System.out.println();
        System.out.println("The ranges without enums are as follows");
        for(TrafficLight trafficLight : EnumSet.range(TrafficLight.STOP,TrafficLight.G0))
        System.out.printf("%-25s%-20s%n",trafficLight.getEnumConstant(),trafficLight.getDuration());

    }
}
