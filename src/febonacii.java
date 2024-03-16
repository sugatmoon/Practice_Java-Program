import java.util.Scanner;

public class febonacii {
    public static void main(String[] args) {
        int t1 = 0;
        int t2 =1;
        int t3;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Fibonaceei Series: ");
        int y=3;
        for(int i =3;i<=n;++i){
            if(y == i){
                for(int z=0;z<2;++z){
                    System.out.print(z);
                    if(z==1){
                        break;
                    }
                        System.out.print(",");
                }
            }
            t3 = t1 + t2;
            t1 = t2;
            t2 = t3;
            System.out.print(","+t3);
        }
    }
}
