class phone{
    public void call(){
        System.out.println("Calling the number to phone...");
    }
    public  void on(){
        System.out.println("Trun on the phone...");
    }
    public void off(){
        System.out.println("Turn off the phone...");
    }
}
class smartPhone extends phone{
    @Override
    public void call(){
        System.out.println("Calling the number to Smart Phone...");
    }
    @Override
    public  void on(){
        System.out.println("Trun on the Smart phone...");
    }
    @Override
    public void off(){
        System.out.println("Turn off the Smart phone...");
    }
}
public class Dinymiv_method_dispatch {
    public static void main(String[] args) {
//        phone ph = new phone();
//        smartPhone sm = new smartPhone();
        phone ph = new smartPhone();
        ph.call();
        ph.off();
        ph.on();
//        sm.on();
//        sm.off();
//        sm.call();
    }
}
