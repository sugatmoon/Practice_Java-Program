import java.util.Scanner;

public class for_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius:");
        int a = sc.nextInt();
        System.out.println("Enter the height:");
        int b = sc.nextInt();
        reactangle x =new reactangle(a, b);
        System.out.println("Area of Reactangle:"+x.areOfreactangle());
        System.out.println("Perimeter of Reactangle:"+x.perimeterOfreacangle());
    }
}
class reactangle{
    int redius;

    int height;
    public reactangle(int redius, int height) {
        this.redius = redius;
        this.height = height;
    }
    public int areOfreactangle(){
        int area = redius*height;
        return area;
    }
    public int perimeterOfreacangle(){
        int perimeter = 2*(redius+height);
        return perimeter;
    }
}
