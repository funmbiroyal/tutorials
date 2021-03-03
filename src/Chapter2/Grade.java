import java.util.Scanner;
public class Grade{
  public static void main(String [] args){
Scanner space = new Scanner (System.in);
System.out.println("Enter your score....");
int score = space.nextInt();

if (score >= 0 && score <= 100){

if( score >= 90 ){
	System.out.println("Your grade is A");

}

if( score >= 80 && score < 90){
	System.out.println("Your grade is B");
}

if( score >= 70 && score < 80){
	System.out.println("Your grade is C");
}

if (score < 70){
System.out.println("Your grade is F");

}



}
else
System.out.println("Out of range!, enter number between 0 and 100.");
}

}