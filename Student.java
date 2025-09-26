public class Student extends User {
    private String studentId;
    private String grade;

    public Student(String name, int age, String email, String phone, String studentId, String grade) {
        super(name, age, email, phone); // Call User constructor
        this.studentId = studentId;
        this.grade = grade;
    }

    // Override toString() to add student-specific info
    @Override
    public String toString() {
        return super.toString() + "\n" +   // reuse User’s toString
               "Student ID : " + studentId + "\n" +
               "Grade      : " + grade +
               "\n---------------------------------";
    }
}
