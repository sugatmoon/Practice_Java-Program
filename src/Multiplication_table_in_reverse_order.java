import java.util.Scanner;

public class Multiplication_table_in_reverse_order {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        for(int i=10;i>=1;i--)
        {
            System.out.printf("%d*%d=",num,i);
            System.out.println(num*i);
        }
    }
}
