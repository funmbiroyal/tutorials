package sMsys;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
    School school;
    Student eden;
    Student jude;

    @BeforeEach
    void setUp() {
    school = new School("semicolon","312 herbert Macaulay");
    eden = new Student(1,"eden","boyo");
    jude = new Student(2,"jude", "nenma");
    }
@Test
void testThatSchoolExists(){
        assertNotNull(school);

}
@Test
void testThatSchoolCanAdmitStudent(){
        school.admitStudent(eden);
        assertEquals(1, school.getStudents().size());
        assertEquals("eden", school.getStudents().get(0).getFirstname());
        assertEquals("boyo", school.getStudents().get(0).getLastName());

}
@Test
void testThatSchoolCanExpelStudent(){
        school.admitStudent(eden);
      assertEquals(1, school.getStudents().size());
      assertEquals("eden", school.getStudents().get(0).getFirstname());
       assertEquals("boyo", school.getStudents().get(0).getLastName());
        school.admitStudent(jude);
      assertEquals(2, school.getStudents().size());
     assertEquals("jude", school.getStudents().get(1).getFirstname());
     assertEquals("nenma", school.getStudents().get(1).getLastName());
     school.expelStudent(2);
     assertEquals(1,school.getStudents().size());

    }
    @Test
    void testThatSchoolCanGetAStudent(){
        school.admitStudent(eden);
        assertEquals(1, school.getStudents().size());
        assertEquals("eden", school.getStudents().get(0).getFirstname());
        assertEquals("boyo", school.getStudents().get(0).getLastName());
        school.admitStudent(jude);
        assertEquals(2, school.getStudents().size());
        assertEquals("jude", school.getStudents().get(1).getFirstname());
        assertEquals("nenma", school.getStudents().get(1).getLastName());
        Student student = school.getAStudent(1);
        System.out.println(student);
//        assertNotNull(student);
//        assertEquals("jude",student.getFirstname());
    }

    @AfterEach
    void tearDown() {
    }
}