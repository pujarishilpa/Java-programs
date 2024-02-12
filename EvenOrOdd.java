import java.util.Scanner;
class EOrO {
public static void main(String args[]) {
    try(Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter Number : ");
        int Num = sc.nextInt();
        if(Num % 2 == 0) {
            System.out.println("Given number is EVEN ");
        }
        else {
            System.out.println("Given number is ODD ");
        }
    }
}
}