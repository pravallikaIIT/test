import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ZOneDate {
    public static void main(String[] args) {
        String datetimeStr = "2024-08-14T10:52:18-07:00";
       // String merchantTimeZone = "Asia/Calcutta";
        String merchantTimeZone = "America/Chicago";
        ZonedDateTime originalDateTime = ZonedDateTime.parse(datetimeStr);
        LocalDate localDate = originalDateTime.toLocalDate();
        Date date1 = Date.from(localDate.atStartOfDay(ZoneId.of(merchantTimeZone)).toInstant());
        System.out.println(date1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dateString = localDate.format(formatter);

        ZonedDateTime utcDateTime = originalDateTime.withZoneSameInstant(ZoneId.of(merchantTimeZone));

    }
}
