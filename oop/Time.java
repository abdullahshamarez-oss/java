import java.util.*;

class CalcTime {
    
    int second;

    public void time() {
        int hour = second / 3600;
        int rem = second % 3600;
        int minute = rem / 60;
        int sec = rem % 60;

        System.out.println(hour + ":" + minute + ":" + sec);
    }
}

public class Time {
    public static void main(String[] args) {
        CalcTime T1 = new CalcTime();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter time in seconds: ");
        T1.second = input.nextInt();   // ✅ correct usage

        T1.time();

        input.close(); // good practice
    }
}