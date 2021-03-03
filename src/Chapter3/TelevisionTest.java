
public class TelevisionTest{
 public static void main(String [] args){

Television gracey = new Television( "Phillips",203413, 30, 11, 52, true);

	/**gracey.increaseVolume();
	gracey.decreaseVolume();
	gracey.decreaseVolume();
	gracey.decreaseVolume();
	gracey.decreaseVolume();**/

System.out.printf("The name of the television is  %s%n" , gracey.getProductName());
System.out.printf("The productNumber of the television is %d%n" , gracey.getProductNumber());
System.out.printf("The Screensize of the television is %d%n" , gracey.getScreenSize()); 
System.out.printf("The Channel of the television is %d%n" , gracey.getChannel());

System.out.printf("The Volume of the television is %d%n" , gracey.getVolume()); 
//System.out.printf("The Volume is increased to %d%n" , gracey.getVolume()); 
 








}


}

