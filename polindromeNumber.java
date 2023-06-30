import java.util.Scanner;

public class polindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int Nnum = num;
        int r = 0;

        while (num != 0) {
            int digit = num % 10;
            r = r * 10 + digit;
            num /= 10;
        }
        if (r == Nnum) {
            System.out.println("It is Polinedrome Number");
        } else {
            System.out.println("It is not Polinedrome Number");
        }
    }
}
