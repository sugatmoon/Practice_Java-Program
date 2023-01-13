import org.w3c.dom.ls.LSOutput;

class sugat{
    int x;
    String name;
    public void print(){
        System.out.println(x+" "+name);
    }
        }
public class class_object {
    public static void main(String[] args) {
        sugat info =new sugat();
        info.x =5;
        info.name = "sugat";
//        System.out.println(name+x);
        info.print();
    }
}
