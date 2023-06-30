class cirle {

    public int radius;


    public double primeter_circle () {
        return  2 * 3.1415 * radius;
    }
    public int diameter_of_circle () {
        return 2 * radius;
    }
    public double area_of_circle () {
        return 2 * 3.1415 * radius*radius;
    }


}

public class circle_class {
    public static void main(String[] args) {
        cirle c = new cirle();
        c.radius = 25;
        System.out.println( "Perimeter of circle: " +  c.primeter_circle() );
        System.out.println( "Diameter of circle: " + c.diameter_of_circle() );
        System.out.println( "Area of circle: " + c.area_of_circle() );
    }
}

