package sMsys;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student;
    @BeforeEach
    void setUp() {
        student = new Student(1,"kola", "bello");
    }
@Test
void testThatStudentCanBeCreated() {

        assertNotNull(student);
}
    @Test
    void testThatStudentCanSelectCourses(){
        student.selectCourse(1,"jv101","java");
        assertEquals(1,student.getCourses().size());
        assertEquals("jv101",student.getCourses().get(0).getCourseCode());
        assertEquals(1,student.getCourses().get(0).getId());
        assertEquals("java",student.getCourses().get(0).getCourseTitle());
        student.selectCourse(2,"py102","python");
        assertEquals(2,student.getCourses().size());
        assertEquals("py102",student.getCourses().get(1).getCourseCode());
        assertEquals(2,student.getCourses().get(1).getId());
        assertEquals("python",student.getCourses().get(1).getCourseTitle());
        assertEquals(2,student.getNumberOfCoursesSelected());
    }
    @Test
    void testThatStudentCanRemoveCourses(){
        student.selectCourse(1,"jv101","java");
        assertEquals(1,student.getCourses().size());
        assertEquals("jv101",student.getCourses().get(0).getCourseCode());
        assertEquals(1,student.getCourses().get(0).getId());
        assertEquals("java",student.getCourses().get(0).getCourseTitle());
        student.selectCourse(2,"py102","python");
        assertEquals(2,student.getCourses().size());
        assertEquals("py102",student.getCourses().get(1).getCourseCode());
        assertEquals(2,student.getCourses().get(1).getId());
        assertEquals("python",student.getCourses().get(1).getCourseTitle());
        assertEquals(2,student.getNumberOfCoursesSelected());
        //student trying to remove a Course
        student.removeCourse(1);
        assertEquals("python",student.getCourses().get(0).getCourseTitle());
        assertEquals(1,student.getCourses().size());
    }
@Test
 void testThatStudentCanGetACourse(){
    student.selectCourse(2,"py102","python");
    assertEquals(1,student.getCourses().size());
    assertEquals("py102",student.getCourses().get(0).getCourseCode());
    assertEquals(2,student.getCourses().get(0).getId());
    assertEquals("python",student.getCourses().get(0).getCourseTitle());
    assertEquals(1,student.getNumberOfCoursesSelected());
    //get course
    Course course = student.getACourse("py102");
    assertNotNull(course);
    assertEquals("python",course.getCourseTitle());
}
@Test
void testThat_NoSuchElementExceptionIsThrownWhenAttemptingToGetAWrongCourse(){
    student.selectCourse(1,"jv101","java");
    assertEquals(1,student.getCourses().size());
    assertEquals("jv101",student.getCourses().get(0).getCourseCode());
    assertEquals(1,student.getCourses().get(0).getId());
    assertEquals("java",student.getCourses().get(0).getCourseTitle());

        assertThrows(NoSuchElementException.class, ()-> student.getACourse("ww111"));
}
@Test
void testThatStudentCanGetAllCourses(){
    student.selectCourse(1,"jv101","java");
    assertEquals(1,student.getCourses().size());
    assertEquals("jv101",student.getCourses().get(0).getCourseCode());
    assertEquals(1,student.getCourses().get(0).getId());
    assertEquals("java",student.getCourses().get(0).getCourseTitle());
    student.selectCourse(2,"py102","python");
    assertEquals(2,student.getCourses().size());
    assertEquals("py102",student.getCourses().get(1).getCourseCode());
    assertEquals(2,student.getCourses().get(1).getId());
    assertEquals("python",student.getCourses().get(1).getCourseTitle());
    assertEquals(2,student.getNumberOfCoursesSelected());
    //Student trying to get all courses
      List<Course> courses;
             courses = student.getAllCourses();
             assertNotNull(courses);
             assertEquals("java",courses.get(0).getCourseTitle());
             assertEquals("python",courses.get(1).getCourseTitle());
}
    @AfterEach
    void tearDown() {
    }
}