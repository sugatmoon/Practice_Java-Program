abstract class Bike{
//    abstract void break();
    abstract void breakB();
    public void moon(){
        System.out.println("Hello, Sugat!!!!");
    }
    Bike(){
        System.out.println("This is constructer statement.");
    }
}
class SportBike extends Bike{
    public SportBike(){
        super();
    }
    public void breakB(){
        System.out.println("This is Break System of Sport Bike.");
    }
}
class mountainBike extends Bike{
    mountainBike(){
        super();
    }
    public void breakB(){
        System.out.println("This is Break System of Mountain Bike.");
    }
}

public class abstraction_in_java {
    public static void main(String[] args) {
        SportBike sb = new SportBike();
        mountainBike mb = new mountainBike();
        sb.breakB();
        sb.moon();
        mb.breakB();
        mb.moon();
    }
}
