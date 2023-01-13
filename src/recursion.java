import java.util.Scanner;

public class recursion {
    static int recursion(int num)
    {
        if(num==1){
            return 1;
        }
        else return num*recursion(num-1);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Product of number:"+ recursion(num));
    }
}
