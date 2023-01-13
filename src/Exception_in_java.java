public class Exception_in_java {
    public static void main(String[] args) {
        int a =1000;
        int b = 0;
        try{
            float c = a/b;
        }
        catch (Exception e){
            System.out.println("<"+e+">");
        }
        System.out.println("This is after the error");

    }
}
