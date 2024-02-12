// A program to find Area of Circle.
import java.util.Scanner;
class Circle {
    public static void main (String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Radius : ");
            int radius = sc.nextInt();
        
            System.out.println("Area of Circle is : " +  3.14 * radius * radius);
        }
    }
}