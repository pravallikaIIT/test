import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Timezone {
    public static void main(String[] args) {
        String merchantTimeZone = "America/Chicago";
        ZonedDateTime merchantTime = ZonedDateTime.now(ZoneId.of(merchantTimeZone));
       // System.out.println("merchant time ------->. "+merchantTime);
        String startDate = "2024-08-14T10:52:18-07:00";
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(startDate, formatter);
        LocalDateTime localDateTime = zonedDateTime.toLocalDateTime();
        Date date = Date.from(localDateTime.atZone(ZoneId.of(merchantTimeZone)).toInstant());
        //System.out.println(date);

        String dateTimeString = "2024-08-14T10:52:18-07:00";
        OffsetDateTime dateTime = OffsetDateTime.parse(dateTimeString, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        System.out.println("Parsed Date-Time: " + dateTime);
    }
}