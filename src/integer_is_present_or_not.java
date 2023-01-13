import java.util.Scanner;

public class integer_is_present_or_not {
    public static void main(String[] args) {
        int num[] = {12,65,58,87,99,754,6,4,466,12,423,46,};
        Scanner sc = new Scanner(System.in);
        int check_number = sc.nextInt();
        for(int n : num){
            if(n!=check_number){
            }
            else
            {
                System.out.println("Present!!!");
                break;
            }
        }
    }
}
