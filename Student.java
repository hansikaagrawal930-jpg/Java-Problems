public class Student {
    // Encapsulation: private data
    private int studentId;
    private String name;

    // Constructor
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Method
    public void displayInfo() {
        System.out.println("ID: " + studentId + ", Name: " + name);
    }

    // Main method (program starts here)
    public static void main(String[] args) {
        Student s1 = new Student(101, "Hansika"); // object created
        s1.displayInfo();                        // method call
    }
}
