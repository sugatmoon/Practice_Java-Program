import java.util.Scanner;

public class multipleication_table_using_method {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        multiplecation(n);
    }
    static void multiplecation(int n){
        for(int i=1;i<=10;i++){
            System.out.printf("%d * %d= %d",n,i,i*n);
            System.out.println("");
        }
    }
}
