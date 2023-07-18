
public class wrapperClass {
    public static void main(String[] args) {
        int a = 10;

        Integer i = Integer.valueOf(41);
        System.out.println(i);
        Float f = Float.valueOf(42);

        byte x = 42;
        Byte b = Byte.valueOf(x); // Auto-Boxing
        Byte y = x;
        System.out.println(b);
        System.out.println(x);

        short d = 45;
        Short  s  = Short.valueOf(d); // Auto- boxing

        Long l = Long.valueOf(45);

        Character c = Character.valueOf('h');

        Boolean bl = Boolean.valueOf(true);

        Double db = Double.valueOf(45);

        short xx = s; // auto-unboxing
        short xxx = s.shortValue();
        System.out.println(xxx);



    }
}
