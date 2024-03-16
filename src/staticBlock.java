
class black {
    static {
        System.out.println("Block1");
    }
    static {
        System.out.println("Black2");
    }
}
public class staticBlock {
    static {
        System.out.println("Static Block 1");
    }
    static {
        System.out.println("Static Block 2");
    }

    public static void main(String[] args) {
         black b = new black();
        System.out.println("Inside The main methode");
    }
    static {
        System.out.println("Static Block 3");
    }
}
