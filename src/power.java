import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = sc.nextInt();
        double pow = sc.nextInt();

        double y = Math.pow(num,pow);
        System.out.println(y);

    }
}
