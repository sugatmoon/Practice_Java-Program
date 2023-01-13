import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class nested_try_catch {
    public static void main(String[] args) {
        int [] arr = new int[3];
        arr[0] = 8;
        arr[1] = 12;
        arr[2] = 14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index of Array: ");
        int a = sc.nextInt();
        System.out.print("Enter the Divident: ");
        int b = sc.nextInt();
        try{
            int c = a+b;
            System.out.println("Value: "+ c);
            try{
                int d = arr[a]/b;

            }
            catch (ArithmeticException ae){
                System.out.println("---->"+ ae);
            }
            catch (IndexOutOfBoundsException oob){
                System.out.println("---->"+ oob);
            }
        }
        catch (Exception ex){
            System.out.println("Other exception are: ");
        }
    }
}
