class outerClass1 {
    int x = 4;
    int y = 4;
    public void method1 () {
        System.out.println("Inside the Outer Methode 1");
        if (x == y) {
            System.out.println("X = Y");
        }
                    class  localInner {
                        public void meth(){
                            System.out.println("Print the Inner local Class.");
                        }
                        int a = 4;
                    }
        //localInner li = new localInner();
        System.out.println("Calling local inner Class inside the methode");
        new localInner().meth();
    }

}
public class localInner {
    public static void main(String[] args) {
        outerClass1 oc1 =new outerClass1();
        oc1.method1();


    }

}
