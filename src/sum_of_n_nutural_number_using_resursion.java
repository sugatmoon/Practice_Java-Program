import java.util.Scanner;

public class sum_of_n_nutural_number_using_resursion {
    static  int sum_recurtion(int num){
        if(num==1){
            return 1;
        }
        return num + sum_recurtion(num -1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Sum of nth Natural Number:"+sum_recurtion(num));
    }
}
