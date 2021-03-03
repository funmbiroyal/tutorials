public class Mp3Player{

 private String audio;
 private boolean isOn;
 private int volume = 15;

public Mp3Player(String audio,boolean isOn,int volume){
	
	
	this.audio = audio;
	this.isOn = isOn;
	this.volume = volume;

}

public void setAudio(String audio){
	this.audio = audio;
}

public String getAudio(){
	return audio = audio;
}


public void isOn(boolean isOn){
	isOn = true;
}

public boolean isOn(){
       return true;
}
public void setVolume(int volume){
	this.volume = volume;
}
	
public void increaseVolume(){
	if(volume >= 0 && volume < 100)
	volume ++;
}

public void decreaseVolume(){
	if(volume >0 && volume <= 100)
	volume --;
}

public int getVolume(){
	return volume;
}

 










}




