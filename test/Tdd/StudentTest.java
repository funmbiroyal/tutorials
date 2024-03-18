package Tdd;

import Extras.Admin;
import Extras.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StudentTest {
    Student student;
    Admin admin;
    @BeforeEach
    void startEachTestWith(){
        student = new Student();
        admin = new Admin();
    }
    @Test
    void studentCanBeCreatedTest(){
        assertNotNull(student);
    }
    @Test
    void canGenerateIdForStudent1Test(){

        assertEquals("2021SCV1",admin.generateStudentId("2021", "SCV"));
        assertEquals("2021SCV2",admin.generateStudentId("2021", "SCV"));
//        assertEquals("g-ajadi@gmail.com",admin.generateStudentEmail("g","ajadi"));

    }
    @Test
    void canGenerateIdForStudent2Test(){

        assertEquals("2021SCV2",admin.generateStudentId("2021", "SCV"));
        assertEquals("j-udom@gmail.com",admin.generateStudentEmail("j","udom"));
    }


}
