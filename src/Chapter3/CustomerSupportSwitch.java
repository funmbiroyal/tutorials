import java.util.Scanner;

public class CustomerSupportSwitch {
    public static void main(String[] args) {
        String promptMessage = """
                press 1 for English.
                press 2 for Yoruba.
                press 3 for Igbo.
                press 4 for Hausa.
                
                """;
        System.out.println(promptMessage);

                Scanner userInputCollector = new Scanner(System.in);
        int userInput = userInputCollector .nextInt();
        switch (userInput){
            case 1:
                System.out.println("Hello World!");
                break;
            case 2:
                System.out.println("Eku deedee iwoyi!");
                break;
            case 3:
                System.out.println("Igbo kwenu!");
                break;
            case 4:
                System.out.println("Ina n kwana!");
                break;
            default:
                System.out.println("Not Valid");

        }

    }



}
