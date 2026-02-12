package StudentManagementSystem;
// Inheritance
public class Student extends Person {

    private int roll;
    private Course course;
    private ExamResult result;
    public double cgpa;

    // Constructor
    public Student(String name, int age, int roll, Course course, ExamResult result) {
        super(name, age);
        this.roll = roll;
        this.course = course;
        this.result = result;
    }
    
    // Method Overloading
    public void showStudent() {
        displayInfo();
        System.out.println("Roll: " + roll);
        course.showCourse();
        System.out.println("Marks: " + result.getMarks());
    }

    public void showStudent(boolean showGrade) {
        showStudent();
        if(showGrade) {
            System.out.println("Grade: " + result.calculateGrade());
            System.out.println("Result: " + result.getResultStatus());
        }
    }
}
