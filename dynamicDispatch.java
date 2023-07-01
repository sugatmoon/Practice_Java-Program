
class super1 {
    public void meth1 () {
        System.out.println("Super methode 1");
    }
    public void meth2 () {
        System.out.println("Super method 2");
    }
}
class sub1 extends super1 {
    @Override
    public void meth2 () {
        System.out.println("Sub methode 2");
    }
    public void meth3 () {
        System.out.println("Sub method 3");
    }
}
public class dynamicDispatch {
    public static void main(String[] args) {
        // Calling superclass methodes

//        super1 su  = new super1();
//        su.meth1();
//        su.meth2();

        // Calling subclass methodes
//        sub1 sub = new sub1();
//        sub.meth1();
//        sub.meth2();
//        sub.meth3();

        //Dynamic Dispatch method
        super1 sup = new sub1();
        sup.meth1();
        sup.meth2();
    }
}


