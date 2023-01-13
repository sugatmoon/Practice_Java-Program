import java.util.Scanner;

public class febonacci_series {
    static void recursion(int num){
        int num1 = 0;
        int num2 =1;
        for(int i =0;i<=num;i++){
            System.out.println(num1);
            int next = num1+num2;
            num1 =num2;
            num2 = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        recursion(num);
    }
}
