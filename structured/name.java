import java.util.*;
public class name {
    static void printMyName(String name){
        System.out.println("My name is: "+name);
        return;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = input.nextLine();
        printMyName(name);
    }
    
}
