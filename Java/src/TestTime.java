import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TestTime {
    public static void main(String[] args) {
        String date = "2024-08-13 12:44:03.703000";
        String te = "2024-08-21 18:36:03.878";
        String dateTimeStrsubS = te.substring(0,19);
        String merchantTimeZ = "UTC";
        String dateTimeStr = date.substring(0,19);
        System.out.println(dateTimeStr);
        String merchantTimeZone= "Asia/Kolkata";
        String merchantTimeZone1= "America/Chicago";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeStr, formatter);
        LocalDateTime localDateTime1 = LocalDateTime.parse(dateTimeStrsubS, formatter);
        ZoneId zoneId = ZoneId.of(merchantTimeZone);
        ZoneId zoneId1 = ZoneId.of(merchantTimeZone1);
        ZoneId zoneId2 = ZoneId.of(merchantTimeZ);

        ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
        ZonedDateTime zonedDateTime1 = localDateTime.atZone(zoneId1);
        ZonedDateTime zonedDateTime2 = localDateTime1.atZone(zoneId2);
        System.out.println(zonedDateTime2);

        System.out.println(zonedDateTime);
        OffsetDateTime offsetDateTime = zonedDateTime.toOffsetDateTime();
        OffsetDateTime offsetDateTime1 = zonedDateTime2.toOffsetDateTime();

        System.out.println(offsetDateTime1);
        System.out.println(offsetDateTime.toString());
    }
}
