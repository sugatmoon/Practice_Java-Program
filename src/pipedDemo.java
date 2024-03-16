
import java.util.*;

class Producer extends  Thread{
    OutputStream os;
    public Producer(OutputStream o){
        os = o;
    }
    public void run(){
    int count= 0;
    while (true){
        try {
            os.write(count);
        }catch (Exception e){}
    }

    }
}


public class pipedDemo {
}
