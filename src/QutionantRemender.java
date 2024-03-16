import java.util.Scanner;

public class QutionantRemender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dividant:");
        int dividant = sc.nextInt();
        System.out.println("Divisor:");
        int divisor = sc.nextInt();
        System.out.println("Qutiant:"+dividant/divisor);
        System.out.println("Remender:"+dividant % divisor);
    }
}
