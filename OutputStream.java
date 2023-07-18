
import java.io.FileReader;

public class OutputStream {
    public static void main(String[] args) throws Exception{
        try(FileReader file = new FileReader("C:/Users/USER/Downloads/test.txt")){

            int x;
            while ( (x=file.read() ) != -1){

            System.out.print((char)x);
            }

        }

    }

    public void write(int count) {
    }
}
