public class AirConditioner{

   private boolean isOn;
   private String productName;
   private int temperature = 18;


public void setTemperature(){
}

public int getTemperature(){
       return temperature;
}

public void increaseTemperature(){
       
	if(temperature >= 18 && temperature <= 30);
        	temperature ++;

}


public  void decreaseTemperature(){

	if (temperature > 18 && temperature <= 30);
                 temperature --;
}

public void setProductName(String prodName){
      productName = prodName;
}

public String getProductName(){
       return productName;
}

public boolean isOn(){
       return true;
}

public void setOn(){
       
}

}