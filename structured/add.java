import java.util.*;

public class add {
    static void sum(int a, int b) {
        System.out.println("summing of " + a + " and " + b + " is: " + (a + b));
        return;
    }

    static int Sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int a = input.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = input.nextInt();
        sum(a, b);
        System.out.println("sum of " +a+ " and" +b+ " is: "+Sum(a, b));
    }
}
