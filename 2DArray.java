import java.util.Scanner;
class Array {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of rows & columns : ");
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            int[][] Numbers = new int[rows][cols];
            System.out.println("Enter Elements : ");
            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {
                    Numbers[i][j] = sc.nextInt();
                }
            }
            System.out.println("Your 2D Array : ");
            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {
                    System.out.println(Numbers[i][j]);
                }
            }

        }
    }
}