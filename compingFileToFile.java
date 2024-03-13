import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class compingFileToFile {
    public static void main(String[] args) throws Exception{
        try(FileInputStream fi = new FileInputStream("C:/Users/USER/Downloads/file1.txt");
            FileInputStream fo = new FileInputStream("C:/Users/USER/Downloads/file2.txt");
            FileOutputStream fw = new FileOutputStream("C:/Users/USER/Downloads/Desti.txt")){
            SequenceInputStream sq = new SequenceInputStream(fi,fo);
            int x;
            while ((x= sq.read()) != -1) {
                fw.write(x);
                System.out.print((char) x);
            }


        }

    }
}
