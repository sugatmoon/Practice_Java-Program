
class circle {
    public double  radius;

    public double area() {
        return Math.PI*radius * radius;
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    public double cercumference() {
        return perimeter();
    }
}
class cylinder1 extends circle {
    public double height;

    public double volume(double height) {
        return area() * height;
    }
}
public class inheritance_class  {

    public static void main(String[] args) {
        cylinder1 cy = new cylinder1();

        cy.radius = 2.1;

        System.out.println("Area of cylinder: "+ cy.volume(54));
    }
}
