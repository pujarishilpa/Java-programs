import java.util.Scanner;
class Factorial {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Number : ");
            int n = sc.nextInt();

            fact(n);
           
        }
    }
    public static void fact(int n) {
        int factorial = 1;
        for(int i = 1; i <= n;i++ )
        factorial = factorial * i;
        System.out.println("Factorial of given number is : " + factorial);
    
    }
}