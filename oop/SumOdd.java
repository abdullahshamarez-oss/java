import java.util.Scanner;

public class SumOdd {
     public void sumOdd(int n){
        int sum = 0; 
        for(int i = 1 ; i <= n ; i+=2 ){
            sum+=i;
        }
        System.out.println("Sum of odd number is: "+sum);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        SumOdd SD1 = new SumOdd();
        System.out.println("Enter value of n: ");
        int n = input.nextInt();
        int[] nums = new int[n];
        
        SD1.sumOdd(n);
    }
}
