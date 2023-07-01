
class rectangle {
    public double lenght;
    public double breadth;
    public double height = 1;

    public rectangle ( double lenght  , double breadth  ){
        this.lenght = lenght;
        this.breadth = breadth;
    }

    public void area_rectangle () {
        System.out.println("Area of Rectangle: " + lenght * breadth);
    }
}
class cuboid extends rectangle {
    public double height;
    cuboid (double lenght, double breadth, double height) {
        super( lenght, breadth);
    }
    public void cuboid () {
        System.out.println("Area of Cuboid: " + super.height * super.breadth * super.lenght);
    }



}
public class referenceKeyword {
    public static void main(String[] args) {

        cuboid r1 = new cuboid(4,5,6);
        r1.area_rectangle();
        rectangle r2 = new rectangle(1.2,6);
        r2.area_rectangle();
        r1.cuboid();
    }
}

