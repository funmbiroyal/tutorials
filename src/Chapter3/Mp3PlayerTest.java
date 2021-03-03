public class Mp3PlayerTest{
 public static void main(String [] args){

Mp3Player gracey = new Mp3Player( "audio" , true, 15);

System.out.printf("The mp3player is %s%n " ,gracey.getAudio());

System.out.printf("The mp3player is %s%n ",gracey.isOn());

System.out.printf("The volume is %s%n" , gracey.getVolume());

gracey.setAudio("paused");
System.out.printf("The mp3player is %s%n " ,gracey.getAudio());

gracey.setAudio("played");
System.out.printf("The mp3player is %s%n " ,gracey.getAudio());

gracey.increaseVolume();
System.out.printf("The  Volume of mp3player is %s%n " ,gracey.getVolume());

gracey.increaseVolume();
System.out.printf("The  Volume of mp3player is %s%n " ,gracey.getVolume());

gracey.decreaseVolume();
System.out.printf("The  Volume of mp3player is %s%n " ,gracey.getVolume());
}









}