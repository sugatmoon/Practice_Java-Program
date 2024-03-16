
class super5 {
    int x = 2;
    static int y  = 2;
    static class inner {
        public  void meth1() {
            System.out.println("Static inner class");
            System.out.println(y);

        }
    }
}
public class staticInner {
    public static void main(String[] args) {
        super5.inner s5 =new super5.inner();
        s5.meth1();

    }
}
