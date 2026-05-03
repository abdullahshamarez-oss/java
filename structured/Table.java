import java.util.*;
public class Table {
    static void printTable(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", a, i, a * i);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a = input.nextInt();
        System.out.println("Table of number " + a + " is:");
        printTable(a);
    }
}