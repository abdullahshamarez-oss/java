import java.util.*;
public class Even{
    
    static String EvenNo(int a){
        return ( a % 2 == 0) ? "even" : "odd";
    }

    static void checkEven(int a){
            if(a % 2== 0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 98 ;
        System.out.println("number "+a+" is : "+EvenNo(a));
        System.out.println("Enter Number: ");
        int x = input.nextInt();
        System.out.println("number "+x+" is: ");
        checkEven(x);
    }
}