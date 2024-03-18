package sMsys;

public class Course {

    private int id;
    private String courseCode;
    private String CourseTitle;
    private boolean isDeactivated;

    public Course(int id, String courseCode, String courseTitle) {
        this.id = id;
        this.courseCode = courseCode;
        CourseTitle = courseTitle;
    }

    public Course(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return CourseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        CourseTitle = courseTitle;
    }


    public boolean deactivateCourse(int courseId) {

        if (!(courseId<=0)){
            this.isDeactivated = true;
        }
        return isDeactivated;
    }
}
