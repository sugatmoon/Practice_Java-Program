//import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class byteArray {
    public static void main(String[] args) throws Exception {
//        byte[] arr = {'a','h','e','j','h','m'};
        ByteArrayOutputStream ba = new ByteArrayOutputStream(20);
        ba.write('l');
        ba.write('a');
        ba.write('m');
        ba.write('q');
        ba.write('d');
        ba.write('n');
//
//        int x;
//        while ((x=ba.read()) != -1) {
//            System.out.print((char)x);
//        String str = new String(ba.readAllBytes());
//        System.out.println(ba.markSupported());
        ba.writeTo(new FileOutputStream("C:/Users/USER/Downloads/Desti.txt"));
        System.out.println(ba);
        }
    }
