public class Student {
    String name;
    int age;
    double marks;

    // Behavior: Check result
    public String checkResult() {
        if (marks >= 50) {
            return name + " is passed";
        } else {
            return name + " is failed";
        }
    }

    // Behavior: Display details
    public void displayDetails() {
        System.out.println("=== Student Data ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Result: " + checkResult());
    }

    public static void main(String[] args) {
        Student S1 = new Student();
        S1.name = "Ali";
        S1.age = 20;
        S1.marks = 87;

        S1.displayDetails();
    }
}