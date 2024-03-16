import java.util.Date;

public class DataTime {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
        Date dt = new Date();
        System.out.println(dt.getYear()+1900);
    }
}
