import java.util.*;
public class Circle {
    double radius;

    void displayArea(){
        double result = Math.PI*radius*radius;
        System.out.println("Area of circle with radius "+ radius+ " is " +result);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Circle c1 = new Circle();
        c1.radius = 5;
        c1.displayArea();
        
        Circle c2 = new Circle();
        System.out.println("Enter radius of circle:");
        c2.radius = input.nextDouble();
        c2.displayArea();
    }

}
