abstract class pen{
   abstract void write();
   abstract void reFill();
}
class foundationPen extends pen{
@Override
    void write(){
        System.out.println("Foundation pen is also used as writting purpose.");
    }
@Override
    void reFill(){
    System.out.println("Fountain pen is also Refilled.");
}
void changeNib(){
    System.out.println("It can be change Nib.");
}


}
public class Practice_on_abstract_and_interface {
    public static void main(String[] args) {
        foundationPen fp = new foundationPen();
        fp.reFill();
        fp.write();
        fp.changeNib();
    }
}
