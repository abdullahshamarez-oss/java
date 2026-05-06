//Enter 3 numbers from the user & make a function to print their average.

import java.util.*;
class Avg {
    public void avg(int a, int b, int c){
        int sum = a + b + c;
        double average = (double) sum / 3;
        System.out.println("Sum is: " + sum);
        System.out.printf("Average: %.2f%n", average);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Avg M1 = new Avg();
        System.out.print("Enter 1st Number: ");
        int a = input.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = input.nextInt();
        System.out.print("Enter 3rd Number: ");
        int c = input.nextInt();

        M1.avg(a, b, c);
    }
}