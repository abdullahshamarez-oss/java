public class GradeBooks {
    String courseName;
    String stdName;
    double marks;

    public void displayBook() {
        System.out.println("=====Grade Book Details=====");
        System.out.println("Course Name: " + courseName);
        System.out.println("Student Name: " + stdName);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        GradeBooks B1 = new GradeBooks();
        B1.courseName = "OOP";
        B1.stdName = "Abdu";
        B1.marks = 90;

        // Object 2
        GradeBooks B2 = new GradeBooks();
        B2.courseName = "Data Structures";
        B2.stdName = "Ali";
        B2.marks = 85;

        // Object 3
        GradeBooks B3 = new GradeBooks();
        B3.courseName = "Database";
        B3.stdName = "Sara";
        B3.marks = 95;

        // Display details
        B1.displayBook();
        B2.displayBook();
        B3.displayBook();
    }
}
