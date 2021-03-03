public class AirConditionerTest {
  public static void main(String[] args){

  AirConditioner gracey = new AirConditioner();

    gracey.isOn();
    gracey.setProductName("Virony");
    //gracey.decreaseTemperature();
    gracey.getTemperature();
    gracey.setOn();
    gracey.increaseTemperature();
    gracey.decreaseTemperature();
    gracey.setTemperature();
    gracey.getProductName();
  

System.out.printf("The Name of the AirCondition is %s%n", gracey.getProductName());
System.out.printf("The Temperature of the AirCondition is %d%n", gracey.getTemperature());


}


}