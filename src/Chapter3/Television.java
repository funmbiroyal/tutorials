public class Television{
  private String ProductName;
  private int ProductNumber;
  private int volume = 0;
  private int channel = 7;
  private int screenSize;
  private boolean IsOn;

public Television(String productName, int ProductNumber, int volume, int channel, int screenSize, boolean IsOn){

     	this.ProductName = productName ; 
	this.ProductNumber = ProductNumber ; 
	this.volume = volume ; 
	this.channel = channel ; 
	this.screenSize = screenSize; 
	this.IsOn = IsOn;           
}

public void setIsOn(boolean isOn){
	IsOn = true;
}
public boolean IsOn(){
	return true;
}


public void setProductName(String productName){
	this.ProductName = productName;

}
public void setProductNumber(int productNumber){
	this.ProductNumber = productNumber;
}

public void setScreenSize(){

}
public void setVolume(){
}

public void increaseVolume(){
 if (volume >= 0 && volume <= 100 )
	volume ++;

}

public void decreaseVolume(){
if (volume > 0 && volume <= 100 )
	volume --;


}

public void setChannel(){

}

public int getChannel(){
	return channel;
}

public int getVolume(){
	return volume;
}
public String getProductName(){
	return ProductName;
}

public int getProductNumber(){
	return ProductNumber;
}

public int getScreenSize(){
	return screenSize;

}


}



