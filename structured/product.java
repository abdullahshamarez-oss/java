import java.util.*;
public class product{
    static void product(int a , int b){
        System.out.println("Product of "+a+ " and "+b+" is: "+(a*b));
        return;
    }
    static int Product(int a, int b){
        int pro = a*b;
        return pro;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = input.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = input.nextInt();

        product(a,b);

        int x = 5;
        int y = 4;

        System.out.println("Product of "+x+" and "+y+" is: "+Product(x,y));

    }
}