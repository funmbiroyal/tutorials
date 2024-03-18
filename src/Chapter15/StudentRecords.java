package Chapter15;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Formatter;
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

    public static class StudentPoll {

        public static void readSurveyInput()  {
            try (Formatter formatter = new Formatter("numbers.txt")){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter survey responses , press ENTER + CTRL + D to stop");
                     while(scanner.hasNext()){
                         formatter.format("%d ",scanner.nextInt());
                     }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }

        public static int[] processSurveyInput(){
            int [] frequency = new int[6];

               try(Scanner scanner = new Scanner(Paths.get("numbers.txt"));
                    Formatter formatter = new Formatter("result.txt"))
                    {
                        while (scanner.hasNext()){
                            int answer = scanner.nextInt();
                            try {
                                ++frequency[answer];
                            } catch (ArrayIndexOutOfBoundsException e) {
                                e.printStackTrace();
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                return frequency;
            }
        public static void writeSurveyResponse(int [] frequency){
               try(Formatter formatter = new Formatter("result.txt"))
                {
                   formatter.format("%s%10s%n", "Ratings","Frequency");
                   for(int i = 1; i < frequency.length; i ++){
                       System.out.printf("%d%10d%n", i, frequency[i]);
                       formatter.format("%d%10d%n", i,frequency[i]);

                   }
               } catch (FileNotFoundException e) {
                   e.printStackTrace();
               }

        }

        public static void main(String[] args) {
            readSurveyInput();
            int [] frequency = processSurveyInput();
            writeSurveyResponse(frequency);
        }
    }
}
