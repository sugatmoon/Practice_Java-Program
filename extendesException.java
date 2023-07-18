
class exceptExtends extends Exception {
    public String toString() {
        return "This is wrong !!!!!!!!!!!!!1";
    }
}

public class extendesException {
    static void fun3() {
        fun2();
    }
    static void fun2() {
        fun1();
    }
    static void fun1() {
       try {
           System.out.println(10/0);
       }catch (ArithmeticException e ){
           System.out.println(e.toString());
           e.printStackTrace();
       }
       try {
           throw new exceptExtends();
       }catch (exceptExtends e) {
           System.out.println(e.toString());
       }
    }
    public static void main(String[] args) {
        fun3();
        }
    }
