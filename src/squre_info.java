import java.util.Scanner;

public class squre_info{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        squre x = new squre();
        x.side = 8;
        x.area();
        x.parameter();
    }
}
class squre{
    int side;
    public void parameter(){
        System.out.println(side*4);
    }
    public void area(){
        System.out.println(side*side);
    }
}
