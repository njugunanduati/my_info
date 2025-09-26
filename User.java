public class User {
    // Fields
    private String name;
    private int age;
    private String email;
    private String phone;

    // Constructor
    public User(String name, int age, String email, String phone) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    // Getters (read access)
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }

    // Setters (write access)
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { 
        if (age >= 0) {
            this.age = age; 
        }else {
            System.out.println("Invalid age!");
        }
    }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }

    // Method to display info
    public void displayInfo() {
        System.out.println(this); // calls toString()
    }

    // Overide toString for clean printing
    @Override
    public String toString() {
        return  "Name   : " + name + "\n" + 
                "Age    : " + age + "\n" +
                "Email  : " + email + "\n" +
                "Phone  : " + phone;
    }
}
