import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Handling_Specific_exception {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
        array[1] = 52;
        array[2] =12;
        array[3]= 54;
        System.out.print("Enter the index of array: ");
        int a = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int b = sc.nextInt();
        try{
            int c = array[a]/b;
            System.out.println(c);
        }
        catch (ArithmeticException ar){
            System.out.println("This is: "+ ar);
        }
        catch (IndexOutOfBoundsException oob){
            System.out.println("This is: " + oob);
        }
        catch (Exception e){
            System.out.println("something other kind of Exception: " + e);
        }
    }
}
