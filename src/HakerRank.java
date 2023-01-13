import java.util.Scanner;

public class HakerRank {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int c = 0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int m = a;
            for(int j = 0; j<n; j++){
                m+= Math.pow(2,j)*b;
                System.out.println(m);
            }

        }
    }
}