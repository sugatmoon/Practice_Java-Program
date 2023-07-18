import java.util.Scanner;

public class nestedTry_Catch {
    public static void main(String[] args) {
        int a [] = { 24,6,58,79,0 };

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the index: ");
        int x = sc.nextInt();

        System.out.println("Enter the index: ");
        int y = sc.nextInt();

        try {
            int z = a[x] / a[y];
            System.out.println(z);

            try {
                System.out.println(a[85]);
            }
            catch (ArrayIndexOutOfBoundsException i ){
                System.out.println(i);
            }

        }
        catch (ArithmeticException e ) {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally, Executed............");
        }
    }
}
