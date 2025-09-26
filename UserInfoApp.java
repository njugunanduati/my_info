import java.util.Scanner;


public class UserInfoApp {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); // Get user input

        System.out.println("=============================================");
        System.out.println("********* Welcome to User infor App *********");
        System.out.println("=============================================");

        // Ask how many users you want to register
        System.out.print("How many users do you want to register? ");
        int numUsers = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        // Create an array of user objects
        User[] users = new User[numUsers];

        // collect student info
        for (int i = 0; i < numUsers; i++) {
            // get the user type
            System.out.print("Enter the type of user (Student/Teacher): ");
            String userType = scanner.nextLine();

            System.out.println("\n--- Enter details for " + userType.toLowerCase() + " " + (i + 1) + "---");
            
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Phone: ");
            String phone = scanner.nextLine();
            if (userType.equals("Student")) {
                System.out.print("Student ID: ");
                String studentId = scanner.nextLine();

                System.out.print("Grade: ");
                String grade = scanner.nextLine();

                // create User object and store in array
                users[i] = new Student(name, age, email, phone, studentId, grade);
            }
            else if (userType.equals("Teacher")) {
                System.out.print("Subject: ");
                String subject = scanner.nextLine();

                System.out.print("Salary: ");
                double salary = scanner.nextDouble();
                scanner.nextLine(); // consume leftover newline

                // create User object and store in array
                users[i] = new Teacher(name, age, email, phone, subject, salary);
            }
            else {
                System.out.println("Invalid user type. Skipping...");
                i--; // repeat this iteration
            }
        }
        
        // Display all users
        System.out.println("\n========== Registered Users ==========");
        for (User u: users) {
            System.out.println("-------------------------------------");
            u.displayInfo(); // call method from user class
        }
        scanner.close();
    }
}
