import java.util.Scanner;
public class Gtting_user_input {
    public static void main(String[] args) {
//        System.out.println("Taking input form user");
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the num1:");
        int num1 = sc.nextInt();
        System.out.print(num1);
//        int num2 = sc.nextInt();
//        System.out.print("The total sum is:");
//        int sum = num1 + num2;
//        System.out.println(sum);
        System.out.println("Enter the name");
        String name = sc.nextLine();
//        boolean nam = sc.hasNextLine();
        System.out.println(name);
//        System.out.println(name);

    }
}
