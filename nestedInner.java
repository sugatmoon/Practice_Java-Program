
class outerClass {
    int x  = 10;
    class innerClass {
        int y  = 45;
        double a = 74.1;
        public void innerMeth() {
            System.out.println("Inner Methode" + y + a + x);
            }
        }
        innerClass ic = new innerClass();
        public  void outerMeth() {
            System.out.println("Outter Methode"+ ic.y + ic.a + x);
    }
}
public class nestedInner {
    public static void main(String[] args) {
//        To access the fiels and attributes of outerClass
        outerClass oc = new outerClass();
        System.out.println(oc.x);
        oc.outerMeth();
//        To access the fields and attributes of innerClass
        outerClass.innerClass ioc = new outerClass().new innerClass();

        ioc.innerMeth();
        System.out.println("Addtion of integer and double value: "+ ioc.y + ioc.a);
    }
}
