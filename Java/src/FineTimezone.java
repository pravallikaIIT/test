import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FineTimezone {
    public static void main(String[] args) {
        String startDate1 = "2024-08-19T10:06:25.000+00:00";
        String startDate2 = "2024-08-19T04:27:33.000+00:00";
        String merchantTimeZone = "Asia/Calcutta";
        ZonedDateTime originalDateTime = ZonedDateTime.parse(startDate1);
        ZonedDateTime utcDateTime = originalDateTime.withZoneSameInstant(ZoneId.of(merchantTimeZone));
        System.out.println("Converted to AMerica: " + utcDateTime.toString());
        ZonedDateTime originalDateTime1 = ZonedDateTime.parse(startDate2);
        ZonedDateTime utcDateTime1 = originalDateTime1.withZoneSameInstant(ZoneId.of(merchantTimeZone));
        System.out.println("Converted to AMerica: " + utcDateTime1);
        ZoneId zone = ZoneId.of("GMT");
        ZonedDateTime utcDateTime12 = originalDateTime.withZoneSameInstant(zone);
        System.out.println("Converted to AMerrrrrica: " + utcDateTime12);
        Instant instant = utcDateTime12.toInstant();
        String s1 = "2024-08-19T09:57:54.000+00:00";
        String s2 = "";
    }
}
