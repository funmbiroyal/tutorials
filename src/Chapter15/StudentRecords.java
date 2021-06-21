package Chapter15;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StudentRecords {


    private static Formatter formatter;

    public static void openFile(){
        try
           {
               formatter = new Formatter("students_records.txt");

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Students record and press ENTER + CTRl + D to stop ");
        formatter.format("%s %12s %10s %15s %5s%n", "Firstname", "LastName","Level","YearOfBirth","Age");
            while (scanner.hasNext()){
                String firstName =  scanner.next();
                String lastname = scanner.next();
                int level = scanner.nextInt();
                int yearOfBirth = scanner.nextInt();
                formatter.format("%s %12s %12d %13d %9d%n",firstName,lastname,level,yearOfBirth, LocalDateTime.now().getYear()-yearOfBirth);

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
