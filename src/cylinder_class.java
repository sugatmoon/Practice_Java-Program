class cylinder {
    private double radius = 0;
    private double height = 0;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if ( radius > 0 ) {
            this.radius = radius;
        }

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if ( height > 0 ) {
            this.height = height;
        }
    }

    public cylinder(double radius, double height) {

        if ( radius > 0 && height > 0 ) {
            this.radius = radius;
            this.height = height;
        }
    }
    public void cylinderProperties() {
        System.out.println("The lateral surface area of cylinder: " + 2 * 3.1415 * radius * height );
        System.out.println("Total surface area of cylinder: " + 2 * 3.1415 * radius * ( radius + height ));
        System.out.println( "The Volume of cylinder: " + 3.1415 * radius * radius * height );
    }
}
public class cylinder_class {
    public static void main(String[] args) {

        // By passing the parameteraized constuctor
        cylinder c = new cylinder(54,56 );
        c.cylinderProperties();

        //By using setter method
        c.setHeight(42);
        c.setRadius(43);
        c.cylinderProperties();
    }
}
