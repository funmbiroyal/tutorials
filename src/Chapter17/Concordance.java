package Chapter17;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.Formatter;
import java.util.Scanner;

public class Concordance {
    private static Formatter formatter;

    public static void openFile(){
        try
        {
            formatter = new Formatter("concordance.txt");

        }
        catch (SecurityException securityException){

            System.err.println("Write permission denied. Terminating.");
            System.exit(1);
        }
        catch (FileNotFoundException fileNotFoundException)
        {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }

    public static void readRecords(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Students record and press ENTER + CTRl + D to stop ");
        formatter.format("%s", "Concordance");
        while (input.hasNextLine()){
            String text =  input.nextLine();

            formatter.format("%s%n",text);

        }

    }

    public static void closeFile(){
        if(formatter!= null){
            formatter.close();
        }
    }

    public static void main(String[] args) {
        openFile();
        readRecords();
        closeFile();

    }
}


