import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    System.out.println("Hello");
    String start = "2024-08-14 04:28:40";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String merchantTimeZone = "Asia/Calcutta";
        LocalDateTime s = LocalDateTime.parse(start, formatter);
        ZoneId zoneId = ZoneId.of(merchantTimeZone);
        Date date = Date.from(s.atZone(zoneId).toInstant());
        System.out.println("Local date time "+s);
        System.out.println("Localtime "+s);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(s.atZone(zoneId).format(formatter1));
        System.out.println(zoneId);
        System.out.println(date);
        LocalTime localTime = LocalTime.ofInstant(date.toInstant(), zoneId);

//        ZonedDateTime sourceZonedDateTime = ZonedDateTime.of(localTime.atDate(localDate), ZoneId.of(merchantTimeZone));
        System.out.println(localTime);

    }
}