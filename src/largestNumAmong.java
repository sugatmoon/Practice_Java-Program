import java.util.Scanner;

public class largestNumAmong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

for(int i =1;i>0;i++){
    System.out.print("Num1");
    int n1 = sc.nextInt();
    System.out.print("Num2");
    int n2 = sc.nextInt();
    System.out.print("Num3");
    int n3 = sc.nextInt();


                int num1, num2;
                if (n1 > n2) {
                    num1 = n1;
                } else {
                    num1 = n2;
                }
                if (num1 > n3) {
                    System.out.println("Largest Number: " + num1);
                } else {
                    System.out.println("Largest Number: " + n3);
                }
            }
    }
}
