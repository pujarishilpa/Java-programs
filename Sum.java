import java.util.Scanner;
class SumAndMultiply {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a & b : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            Add(a,b);
            mult(a,b);

        }
    }
    public static void Add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of a and b is : "+ sum);
    }
    public static void mult(int a, int b) {
        int mult = a * b;
        System.out.println("Product of a and b is : " + mult);
    }

}