import java.util.Scanner;

public class rotatArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,3,5,4,9,7,2,56,6};
        System.out.println("This is the array: "+ arr + "give me the shifting value: ");
        int shift = sc.nextInt();
        int[] temp = new int[arr.length];
        for( int value : arr ){
            temp[shift] = value;
            shift++;
        }
        for (int i = 0; i < shift; i++,shift--) {
            temp[shift] = arr[i];
        }
        System.out.println(temp);
    }
}
