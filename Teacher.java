public class Teacher extends User {
    private String subject;
    private double salary;

    public Teacher(String name, int age, String email, String phone, String subject, double salary) {
        super(name, age, email, phone);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSubject: " + subject + "\nSalary: " + salary;
    }
}
