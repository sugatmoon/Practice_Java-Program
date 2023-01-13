import java.util.Scanner;
public class sum_of_multiplication {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        int sum = 0;
        for(int i= 1;i<=10;i++)
        {
            sum+= num*i;
        }
        System.out.println(sum);
    }
}
