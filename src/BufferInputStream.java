import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferInputStream {
    public static void main(String[] args) throws Exception {
        FileInputStream fi = new FileInputStream("C:/Users/USER/Downloads/file1.txt");
        BufferedInputStream bi = new BufferedInputStream(fi);
//        int x;
//        while ((x = bi.read()) != -1 ) {
//            System.out.print((char) x);
//        }

        System.out.println(fi.markSupported());
        System.out.println(bi.markSupported());
        System.out.print((char)bi.read());
        bi.mark(10);
        System.out.print((char)bi.read());
        System.out.print((char)bi.read());
        bi.reset();
        System.out.print((char)bi.read());
        System.out.print((char)bi.read());
        System.out.print((char)bi.read());
    }
}
