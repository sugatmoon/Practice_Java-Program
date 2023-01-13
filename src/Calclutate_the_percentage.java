import java.util.Scanner;

public class Calclutate_the_percentage {
    public static void main(String[] args) {
        System.out.println("Enter the total marks of all subject:");
        Scanner sc = new Scanner(System.in);
        float total_marks = sc.nextInt();
        float percentage =  total_marks/650;
        float main = percentage*100;
        System.out.println(main);
    }
}