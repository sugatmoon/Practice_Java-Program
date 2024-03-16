import java.util.Scanner;

public class CountDigi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");

        int y = sc.nextInt();
        int i = 0;

        do{
            y = y / 10;
            System.out.println(y);
            ++i;
            if(y == 0){
             System.out.println("Number of Digit: " + i);
                break;
            }
        }while (true);

    }
}
