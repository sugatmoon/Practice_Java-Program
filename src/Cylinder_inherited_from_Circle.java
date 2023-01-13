class circle{
    int radius = 24;
    int diameter = 48;
}
class cylinder1 extends circle{
    public void area(){
        System.out.println(Math.PI*radius*radius);
    }
    public  void twiceRadius(){
        System.out.println(diameter);
    }
}
 public class Cylinder_inherited_from_Circle {
     public static void main(String[] args) {
         cylinder1 sc = new cylinder1();
         sc.area();
         sc.twiceRadius();

     }
}
