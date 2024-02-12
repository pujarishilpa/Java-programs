import java.util.Scanner;
class Arrays {
    public static void main (String args[]) {
           try( Scanner sc = new Scanner(System.in) ) {
            System.out.println("Enter Array size : ");
            int size = sc.nextInt();
            int Number[] = new int[size];
            System.out.println("Enter Elements in  Array : ");
            for(int i = 0; i < Number.length; i++ ) {
                Number[i] = sc.nextInt();
            }
            System.out.println("Enter search Number : ");
            int x = sc.nextInt();
            System.out.println("Your Array : ");
            for(int i = 0; i < Number.length; i++ ) {
                if(x == Number[i]) {
                    System.out.println("Found at the INDEX : " + i);
                }
            }
        }
    }
}