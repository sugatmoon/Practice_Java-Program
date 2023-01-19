import java.util.GregorianCalendar;

public class gregorianCalender {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2024));
        System.out.println(gc.DAY_OF_YEAR);
    }
}