package Extras;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    private int idNumber = 0;
    public String generateStudentId(String year, String schoolCode) {
        String generatedId ="";
        List<String> studentsId = new ArrayList<>();
        studentsId.add("Grace Ajadi");
        System.out.println("Student size is " + studentsId.size());
        //studentsId.add("Joy Udom");
//        for(String studentId : studentsId){
//            System.out.println(studentId);
//           generatedId = year + schoolCode + ++idNumber;
//            System.out.println(generatedId);
//        }

        return generatedId;
    }

    public String generateStudentEmail(String firstLetterOfFirstName, String lastName) {
        String generatedEmail = "";
        List<String> studentsEmail = new ArrayList<>();
        studentsEmail.add("Grace Ajadi");
        //studentsEmail.add("Joy Udom");
        for (String studentEmail: studentsEmail){
            System.out.println("your email is:");
            generatedEmail =  firstLetterOfFirstName + "-" + lastName  +"@gmail.com";
            System.out.println(generatedEmail);

        }
        return generatedEmail;

    }
}
