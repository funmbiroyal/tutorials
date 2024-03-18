package sMsys;

import Chapter8.AlreadyOccupiedException;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private String location;
    private List<Student> students;
    private List<Course>courses;

    public School(String schoolName, String location) {
        this.schoolName = schoolName;
        this.location = location;
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Course> getCourses() {
        return courses;
    }


    public void admitStudent(Student student) {
        students.add(student);
//        for (Student eachStudent: students){
//            if(!(eachStudent.getId() == student.getId())){
//                students.add(student);
//
//            }else
//                throw new StudentAlreadyExistException("student with"+ student.getId()+ " already exist");
        }


    public void expelStudent(int id) {

       students.removeIf(student -> student.getId()== id );
    }

    public Student getAStudent(int id) {
        Student studentToBeFound = null;
        for (Student student: students){
            if (student.getId()==id){
                studentToBeFound = student;
            }else
                throw new StudentNotFoundException("No student found with the id " + id);
        }
        return studentToBeFound;
    }

}
