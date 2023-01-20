

import java.util.Scanner;
public class javaDoc {
/**
 * @author sugatmoon
 * @since 2005
 */
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
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
