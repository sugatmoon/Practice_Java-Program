class myClass {
    private int no_of_Student;
    private int no_of_girl;
    private int no_of_boys;

    private myClass () {
        System.out.println("Private Contructor");
    }

    static private myClass o = null;

    static public myClass getInstance() {
        if ( o == null ) {
            o = new myClass();
        }
        return o;
    }
}
public class singletonClass {
    public static void main(String[] args) {
        myClass ma = myClass.getInstance();
        myClass mb = myClass.getInstance();
        myClass mc = myClass.getInstance();
        myClass md = myClass.getInstance();
        if ((ma == mb) == (mc == md)) {
            System.out.println("All the objects are belong to the singleton class");
        }
    }
}
