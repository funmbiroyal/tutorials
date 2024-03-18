package sMsys;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Student {
    private int id;
    private String firstname;
    private String lastName;
    private List<Course> courses;
    private int numberOfCoursesSelected;


    public Student(int id, String firstname, String lastname) {
        this.id= id;
        this.firstname = firstname;
        this.lastName = lastname;
        courses = new ArrayList<>();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public int getNumberOfCoursesSelected() {
        return numberOfCoursesSelected;
    }

    public void selectCourse(int id, String courseCode, String courseTitle) {

        Course course1 = new Course(id,courseCode,courseTitle);

        courses.add(course1);

        numberOfCoursesSelected++;
    }

    public void removeCourse(int id) {

        courses.removeIf(course -> course.getId() == id);

    }

    public Course getACourse(String courseCode) throws NoSuchElementException {
        Course courseToBeFound = null;
        for (Course course: courses){
            if (!(course.getCourseCode().equals(courseCode))){
                throw new NoSuchElementException("Course " +courseCode+ " not found!");
            }else
                courseToBeFound = course;
        }
        return courseToBeFound;
    }

    public List<Course> getAllCourses() {
        return courses;
    }

    public int getId() {
        return id;
    }
}
