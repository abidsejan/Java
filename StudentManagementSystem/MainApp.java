package StudentManagementSystem;
public class MainApp {

    public static void main(String[] args) {

        Course c1 = new Course("Java Programming", 101);

        ExamResult er = new ExamResult(85);

        // Polymorphism
        Result res = er;          // Parent reference → child object
        Evaluable eval = er;      // Interface reference → object

        Student s1 = new Student("Abid", 21, 1001, c1, er);

        s1.showStudent(true);

        System.out.println("Polymorphism Result Status: " + res.getResultStatus());
        System.out.println("Polymorphism Grade: " + eval.calculateGrade());
    }
}
