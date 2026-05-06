 import java.util.*;
 public class Avgloop {
    public void avg(int ... numbers){
        int sum = 0;
        for(int i : numbers){
            sum += i;
        }

        System.out.println("Sum is "+ sum+ " and Average: " + (sum / numbers.length));
    }
    public static void main(String[] args) {
        Avgloop avgloop = new Avgloop();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the numbers: ");
        for(int i = 0; i < n; i++){
            numbers[i] = input.nextInt();
        }
        avgloop.avg(numbers);

    }
}

public int sum(int... numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }

    public void avg(int sum, int count) {
        double avg = (double) sum / count;
        System.out.println("Average: " + avg);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Main M1 = new Main();

        System.out.print("How many numbers: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        int total = M1.sum(numbers);     // ✅ called ONCE
        System.out.println("Sum is: " + total);

        M1.avg(total, numbers.length);   // use that result
    }
