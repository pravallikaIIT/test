import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Timez {
    public static void main(String[] args) {
        String dateTimeStr = "2024-08-19 16:20:49.000000";
        System.out.println(dateTimeStr.substring(0,21));
        dateTimeStr = dateTimeStr.substring(0,21);
        String merchantTimeZone = "Asia/Kolkata";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S");
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeStr, formatter);
        ZonedDateTime originalZonedDateTime = localDateTime.atZone(ZoneId.of(merchantTimeZone));
        ZonedDateTime zonedDateTime = originalZonedDateTime.withZoneSameInstant(ZoneId.of("GMT"));
        Instant instant = zonedDateTime.toInstant();
        System.out.println(zonedDateTime);
    }
}
