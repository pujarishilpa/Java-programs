import java.util.Scanner;
public class UpdateBit {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            int oper = sc.nextInt();
            int n = 5;
            int pos = 1;
            int bitmask = 1<<pos;
            if(oper == 1) {
                //set
                int newNumber = bitmask | n;
                System.out.println(newNumber);
            }
            else {
                //clear
                int newBitmask = ~(bitmask);
                int newNumber = newBitmask & n;
                System.out.println(newNumber);
            }
        }
    } 
}