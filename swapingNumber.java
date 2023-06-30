import java.util.Scanner;

public class swapingNumber {
    public static void main(String[] args) {
        int Number1 , Number2, swap;
        Scanner sc = new Scanner(System.in);
        System.out.print("Number1:");
        Number1 = sc.nextInt();
        System.out.print("Number2:");
        Number2 = sc.nextInt();
        swap = Number1;
        Number1 = Number2;
        Number2 = swap;

        System.out.print("Number1: "+Number1);
        System.out.print("Number2: "+ Number2);
    }
}
