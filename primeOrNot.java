import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int x;

        boolean flag = false;
        if ( num > 0 && num == 1 && num == 2){
            flag = true;
        }
        while ( num == 1 ) {
            if ( num / num - 1 == 0 ) {
                flag = false;
                break;
            }
            num-- ;
        }
        if ( flag == true ) {
            System.out.println("it is prime number.");
        }
        else {
            System.out.println("It is not a prime number.");
        }
    }
}
