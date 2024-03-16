
class car {
    public void start() {
        System.out.println("Start a Car");
    }
    public  void accelarate() {
        System.out.println("Accelerate the car");
    }
    public void changeGear() {
        System.out.println("Changging a Gare manually");
    }
}
class luxaryCar extends car {
    @Override
    public void changeGear () {
        System.out.println("Ghangging a Gare automatically");
    }
    public void openRoof(){
        System.out.println("Openning Roof of the car");
    }
}
public class methodeOverriding {
    public static void main(String[] args) {
         car cs = new luxaryCar();
        cs.start();
        cs.accelarate();
        cs.changeGear();
    }
}
