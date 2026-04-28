
public class GradeBook {

    private String courseName;
    private double marks;
    private String CGPA;

    public GradeBook(String cn, double mark) {
        courseName = cn;

        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Marks must be in range 0-100");
        }
        marks = mark;
        CGPA = null;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String cn) {
        courseName = cn;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double mark) {
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Marks must be in range 0-100");
        }
        marks = mark;
    }

    public void calculateCGPA() {
        if (marks >= 90) {
            CGPA = "A";
        } else if (marks >= 80) {
            CGPA = "B";
        } else if (marks >= 70) {
            CGPA = "C";
        } else if (marks >= 60) {
            CGPA = "D";
        } else if (marks >= 50) {
            CGPA = "E";
        } else {
            CGPA = "F";
        }
    }

    public String displayDetails() {
        calculateCGPA();
        return "---Grade Book Details---"
                + "\nCourse Name: " + getCourseName()
                + "\nMarks: " + getMarks()
                + "\nCGPA: " + CGPA
                + "\n------------------------";
    }

    public static void main(String[] args) {
        try {
            GradeBook B1 = new GradeBook("OOP", 99);
            B1.setCourseName("DS");
            System.out.println(B1.displayDetails());
            B1.setMarks(-23);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            GradeBook B2 = new GradeBook("AP", 47);
            B2.setCourseName("ENG");
            System.out.println(B2.displayDetails());
            B2.setMarks(-2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            GradeBook B3 = new GradeBook("OOP", 78);
            B3.setCourseName("JAVA");
            System.out.println(B3.displayDetails());
            B3.setMarks(1343);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}