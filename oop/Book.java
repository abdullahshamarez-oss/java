import java.util.*;
public class Book{

    private String courseName;

    public void setCourseName(String name){
        courseName = name;
    }
    public String getCourseName(){
        return courseName;
    }

    public void displayInfo(){
        System.out.printf(" Welcome to the grade book for \n%s!\n", getCourseName());
    }

    public static void main(String[] args){
        Book B1 = new Book();
        B1.setCourseName("OOP");
        B1.displayInfo();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter grade Book name: ");
        String name = input.nextLine();

        B1.setCourseName(name);
        B1.displayInfo();
        
    }
}