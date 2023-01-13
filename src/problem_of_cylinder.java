import java.util.Scanner;

public class problem_of_cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of cylinder:");
        int a = sc.nextInt();
//        x.setRadius(a);
        System.out.println("Enter the height of cylinder:");
        int b = sc.nextInt();
//        x.setHeight(b);
        cylinder x = new cylinder(a,b);
        System.out.println("Radius of Cylinder:"+x.getRadius());
        System.out.println("Height of Cylinder:"+x.getHeight());
        System.out.println("Surface Area:"+x.surfaceAreaOfCylinder());
        System.out.println("Volume:"+x.volumeOfCylinder());
    }
}
class cylinder{
    private int radius;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceAreaOfCylinder(){
        double area = (2*Math.PI*radius*height)+2*Math.PI*radius*radius;
        return area;
    }
    public double volumeOfCylinder(){
        double volume = Math.PI*radius*radius*height;
        return volume;
    }
}