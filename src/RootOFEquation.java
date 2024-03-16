import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class RootOFEquation {
    public static void main(String[] args) {
        System.out.println("Here You Write the value of in the Equation");
        Scanner sc = new Scanner(System.in);
        double a, b, c, x;
        System.out.print("a:");
        a = sc.nextDouble();
        System.out.print("b:");
        b = sc.nextDouble();
        System.out.print("c:");
        c = sc.nextDouble();

        double r1 , r2;
        double disc = b * b -4 * a * c;

        if(disc > 0 ){
            r1 = (-b + Math.sqrt(disc))/(2*a);
            r2 = (-b - Math.sqrt(disc))/(2*a);
            System.out.println("Root 1 : "+r1);
            System.out.println("Root 2 : "+r2);
        }
        else if(disc == 0){
            r1 = r2 = -b/(2*a);
            System.out.println("Root 1 : "+ r1);
            System.out.println("Root 2 : "+ r2);
        }
        else {
            double real = -b/(2*a);
            double imaginary = Math.sqrt(-disc) /(2*a);
            System.out.printf("Root 1: %.2f+%.2fi\n",real, imaginary);
            System.out.printf("Root 2: %.2f-%.2fi",real, imaginary);
        }

    }
}
