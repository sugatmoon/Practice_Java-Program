import java.util.Scanner;

public class Exeption_Handling_using_try_catch_methode{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int a = sc.nextInt();
        System.out.print("Enter the Seconde Number:");
        int b = sc.nextInt();
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception ex){
            System.out.println("This is the resone:" + ex);
        }
        System.out.println("This is after the exception block.");

    }
}
