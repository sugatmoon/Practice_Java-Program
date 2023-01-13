import java.util.Scanner;

public class factorial_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factorial=1;
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            factorial*=i;
        }
        System.out.println("Your Factorial value:"+factorial);
    }
}
