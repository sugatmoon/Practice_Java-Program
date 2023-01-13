import java.util.Scanner;

public class two_matrix_of_array_2by3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[2][3];
        System.out.println("Enter the  element 2*3 order:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        for(int[] a: array)
        {
            for(int b:a)
            {
                System.out.println(b);
            }
        }
    }
}
