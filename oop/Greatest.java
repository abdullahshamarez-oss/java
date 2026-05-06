import java.util.*;
public class Greatest {

    public String great(int a, int b) {
        if (a > b) {
            return a + " is the biggest number";
        } else {
            return b + " is the greatest number";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Greatest G1 = new Greatest();
        System.out.println(G1.great(10, 15));
        
        Greatest G2 = new Greatest();
        System.out.println("Enter 1st Number: ");
        int a = input.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = input.nextInt();
        System.out.println(G2.great(a,b));
        
    }
}