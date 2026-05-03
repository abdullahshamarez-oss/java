import java.util.*;
public class PrimeNo{

    static boolean Prime(int a){
        if(a<=1){
            System.out.println("invalid input");
            return false;
        }
        for(int i = 2 ; i <= a/2 ; i++){
            if(a%i == 0){
                System.out.println("Not Prime");
                return false;
            }
        }
        System.out.println("Prime");
        return true;
    }

    
    static int checkPrime(int a){
        if(a<=1){
            System.out.println("invalid input");
            return -1;
        }
        int count = 0;
        for( int i = 1 ; i <= a ; i++){
            if(a % i== 0){
                count++;
                System.out.println(i);
            }
        }
        if(count > 2){
            System.out.println("Not a prime ");
        }
        else{
            System.out.println("prime");
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 98 ;
        System.out.println("number "+a+" has : "+checkPrime(a)+" divisor");
        System.out.println("Enter Number: ");
        int x = input.nextInt();
        System.out.println("number "+x+" has: "+checkPrime(x)+" divisor");
        Prime(a);
        Prime(x);
    }
}
