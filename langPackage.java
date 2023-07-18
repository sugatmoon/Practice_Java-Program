class myObject {
    @Override
    public String toString() {
        return "This is super String";
    }

    @Override
    public int hashCode() {
        return  100;
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }
}
class myObject1 extends myObject {

}
public class langPackage {
    public static void main(String[] args) {
//        Object o = new Object();
//        Object o1 = o;
//        System.out.println(o.hashCode()) ;
//        System.out.println(o1.hashCode()) ;
//        System.out.println(o) ;
//        System.out.println(o1) ;
//        System.out.println(o.equals(o1));
        myObject mo = new myObject();
        myObject mo2 = new myObject();
        myObject1 mo1 = new myObject1();
//        System.out.println(mo.toString());
        System.out.println(mo.hashCode());
        System.out.println(mo.equals(mo2));
    }
}
