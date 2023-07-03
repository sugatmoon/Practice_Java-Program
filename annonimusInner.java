
abstract class super4 {
        abstract public void methode();
        }
        class outer2 {

    public  void meth1() {
            System.out.println("This is outer methode 1");

            super4 su = new super4() {
                @Override
                public void methode() {
                    System.out.println("This is the anonymus class methode.");
                }
        };
            su.methode();
    }
        }
public class annonimusInner {
    public static void main(String[] args) {
        outer2 o2 = new outer2();
        o2.meth1();
    }
}
