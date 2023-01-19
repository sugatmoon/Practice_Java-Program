import java.util.Scanner;

public class revert_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[6];
        int[] new_array = new int[6];
        System.outz.println("Enter the Volues of Array:");
        for(int i=0;i<6;i++)
        {
         array[i] =sc.nextInt();
        }
        for(int j=5;j>=0;j--)
        {
            System.out.println(array[j]);
        }

    }
}
