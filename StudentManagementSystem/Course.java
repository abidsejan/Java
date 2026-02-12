package StudentManagementSystem;
public class Course {

    private String courseName;
    private int courseCode;

    public Course(String courseName, int courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void showCourse() {
        System.out.println(courseName + " (" + courseCode + ")");
    }
}
