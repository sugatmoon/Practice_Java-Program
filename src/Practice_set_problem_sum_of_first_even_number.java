import java.util.Scanner;

public class Practice_set_problem_sum_of_first_even_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("You Enter the natural number:");
        int num = sc.nextInt();
        int i =0;
        int sum = 0;
        while (i <= num){
            if(i%2==0){
                sum+=i;
            }
            i++;
        }
        System.out.println("Total sum of even natural number:" + sum);
    }
}
