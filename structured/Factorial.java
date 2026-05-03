public class Factorial {

    static int factorial(int a) {
        if (a < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }

        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        return factorial;
    }
    static void fact(int a){
        int fact = 1;
        for(int i = 1;i<=a;i++){
            fact*= i;
        }
        System.out.println("factorial of "+a+" is:"+fact);
    }

    public static void main(String[] args) {
        int a = 5;
        System.out.println("Factorial of " + a + " is: " + factorial(a));
        fact(a);
    }
}