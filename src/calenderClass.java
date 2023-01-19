import java.util.Calendar;
import java.util.TimeZone;

public class calenderClass {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
//        System.out.println(cal.getCalendarType());
        System.out.println(cal.getTimeZone());
        System.out.println(cal.getTimeZone().getID());
    }
}
