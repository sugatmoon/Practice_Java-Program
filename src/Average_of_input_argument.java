import java.util.Scanner;

public class Average_of_input_argument {
    static int AvgNum(int[] num){
        int sum = 0;
        for(int i=0;i<num.length;i++){
            sum =+ num[i];
        }
        return sum/num.length+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int i = 0;
        for(int j= 0;j<num.length;j++){
            num[i] = sc.nextInt();
        }
        for(int a:num){
            System.out.println(a);
        }
        System.out.println("Average of total number Enter:"+ AvgNum(num));
    }
}
