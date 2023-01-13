import java.util.Scanner;

public class Printing_star_by_entring_number {
    static void star_printing(int num){
        for(int i=0;i<num;i++){
            for(int j= 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        star_printing(num);
    }
}
