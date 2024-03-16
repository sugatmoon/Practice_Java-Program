import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z ;

        try {
            z = x > y ? 1:0;
            System.out.println(z);
            z = x /y;
            System.out.println("Try Executed Properly");
        }
        catch ( ArithmeticException e ) {
            System.out.println(e);
        }
    }
}
