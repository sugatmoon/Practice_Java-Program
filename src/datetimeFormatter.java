import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetimeFormatter {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String s = dtf.format(ldt);
        System.out.println(s);
    }
}
