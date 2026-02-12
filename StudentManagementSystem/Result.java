package StudentManagementSystem;
public abstract class Result {

    protected int marks;

    public Result(int marks) {
        this.marks = marks;
    }

    // Getter
    public int getMarks() {
        return marks;
    }

    public abstract String getResultStatus();
}
