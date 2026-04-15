import java.util.*;

public class CalcTime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter time in seconds: ");
        int second = input.nextInt();

        int hour = second / 3600;
        second = second % 3600;
        int minute = second / 60;
        second = second % 60;

        System.out.println(hour + ":" + minute + ":" + second);
    }
}