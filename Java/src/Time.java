import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Time {
    public static void main(String[] args) {
        String datetimeStr = "2024-08-14T10:09:18-07:00";
        String merchantTimeZone = "Asia/Calcutta";
        ZonedDateTime originalDateTime = ZonedDateTime.parse(datetimeStr);
        System.out.println("Original Date Time----->> "+originalDateTime);
        ZonedDateTime utcDateTime = originalDateTime.withZoneSameInstant(ZoneId.of(merchantTimeZone));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S");
        String formattedDateTime = originalDateTime.format(formatter);

        LocalDateTime localDate1 = utcDateTime.toLocalDateTime();
        Date d = Date.from(localDate1.atZone(ZoneId.of(merchantTimeZone)).toInstant());
        System.out.println("Local Date Time ------>> "+d);


    }
}
