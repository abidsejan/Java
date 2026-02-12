package StudentManagementSystem;
// Inherits abstract class + implements interface
public class ExamResult extends Result implements Evaluable {

    public ExamResult(int marks) {
        super(marks);
    }

    // Method Overriding
    @Override
    public String getResultStatus() {
        return marks >= 40 ? "Pass" : "Fail";
    }

    // Interface method
    @Override
    public double calculateGrade() {
        return marks / 10.0;
    }
}
