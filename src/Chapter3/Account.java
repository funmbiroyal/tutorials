public class Account{

  private String name;

  private double balance;

  private double withdraw;

  

public Account(String name, double balance, double withdraw){
	this.name = name;	
	if(balance > 0.0 )
	this.balance = balance;
        this.withdraw = withdraw;
        
  
}  

public void deposit(double depositAmount){
	balance = depositAmount + balance ;


}

public double getBalance(){
	return balance;

}

public void setName(String newAccName){
	name = newAccName;


}

public String getName(){
	return name;
}
public void Withdraw( double withdraw){
    if(withdraw > 0.00)
    balance = balance - withdraw;
	
    

}

}

  




