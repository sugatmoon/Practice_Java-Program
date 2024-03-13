import java.io.CharArrayReader;

public class charArrStream {
    public static void main(String[] args) throws Exception {
        char[] ch = {'d','e','e','q','c','u','z','a'};

        CharArrayReader acr = new CharArrayReader(ch);
        String st = new String(acr.toString());
        int x;
        while ((x= acr.read()) != -1){
            System.out.print((char) x);
        }
    }
}
