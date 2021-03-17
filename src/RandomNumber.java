import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        int difference;
        int sum;
        int quotient;
        int product;

        Scanner scanner = new Scanner(System.in);

                    int counter = 0;

                  while (counter <= 10) {

                      int random1 = (int) (Math.random()*4);
                      int random2 = (int) (Math.random()*4);

                      int  randomNumberQuestion = (int)  (Math.random() * 4);


                      sum  = random1 + random2;
                      difference = random1 - random2;
                     quotient = random1 % random2;
                     product  = random1 * random2;

                      switch (randomNumberQuestion) {
                          case 1 : {
                              System.out.println(random1 + " + " + random2);
                              System.out.println("enter answer");
                              int userInput1 = scanner.nextInt();
                              System.out.println(userInput1 == sum ? "passed" : "failed");
                              break;
                          }
                          case 2: {
                              System.out.println(random1 + " - " + random2);
                              System.out.println("enter answer");
                              int userInput2 = scanner.nextInt();
                              System.out.println(userInput2 == difference ? "passed" : "failed");
                              break;
                          }
                          case 3: {
                              System.out.println(random1 + " % " + random2);
                              System.out.println("enter answer");
                              int userInput3 = scanner.nextInt();
                              System.out.println(userInput3 == quotient ? "passed" : "failed");
                              break;
                          }
                          case 4: {
                              System.out.println(random1 + " * " + random2);
                              System.out.println("enter answer");
                              int userInput4 = scanner.nextInt();
                              System.out.println(userInput4 == product ? "passed" : "failed");
                              break;

                          }
                      }
                      counter++;
                      //System.out.println("Thank you for taking the test, we hope seeing you next time ");
                  }
       System.out.println("Thank you for taking the test, we hope seeing you next time ");
}

    }






