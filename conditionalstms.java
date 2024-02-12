import java.util.Scanner;
class Conditional {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter age : ");
            int age = sc.nextInt();
            if(age > 18)
                System.out.println("you are Adult !");
            else
                System.out.println("you are not Adult !");
        }
    }
}