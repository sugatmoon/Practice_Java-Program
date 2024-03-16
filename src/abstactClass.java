
abstract class super12{

    public super12() {
        System.out.println("Super Constuctor");
    }
    abstract public void meth1() ;
    public void meth2() {
        System.out.println("Super methode2");
    }
}
class sub extends super12 {
    @Override
    public void meth1() {
        System.out.println("Sub methode1");
    }
    public void meth3() {
        System.out.println("Sub methode3");
    }
}
public class abstactClass {
    public static void main(String[] args) {
        super12 su = new sub();
//        su.meth1();
//        su.meth2();
        su.meth1();
        su.meth2();
//        su.meth3();
    }
}
