import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeTest {
    public static void main(String[] args) {
        String datetimeStr = "2024-08-19T16:20:18+05:30";
        // Parse the string to ZonedDateTime
        String merchantTimeZone = "GMT";
        ZonedDateTime originalDateTime = ZonedDateTime.parse(datetimeStr);
        System.out.println("Original ZonedDateTime: " + originalDateTime);
        // Convert to a different timezone (e.g.    , UTC)
        ZonedDateTime utcDateTime = originalDateTime.withZoneSameInstant(ZoneId.of(merchantTimeZone));
        System.out.println("Converted to AMerica: " + utcDateTime);
        // Convert Instant to Date object
        Date date = Date.from(utcDateTime.toInstant());
        System.out.println("Converted to Date: " + date);
        LocalDateTime localDate1 = utcDateTime.toLocalDateTime();
        System.out.println("Local Date 1 "+date);
        // Optionally, if you need the datetime in a specific format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedDateTime = utcDateTime.format(formatter);
        LocalTime now = LocalTime.parse(formattedDateTime, formatter);
        LocalTime plusFiveMinutes = now.plusMinutes(5);
        String formattedTime = String.format("%02d:%02d", plusFiveMinutes.getHour(), plusFiveMinutes.getMinute());
        System.out.println("Formatted UTC DateTime: " + formattedTime);
        System.out.println("Formatted UTC DateTime: " + formattedDateTime);
    }
}
