import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestMain {
    public static void main(String[] args) {
        String datetimeStr = "2024-08-14T10:52:18-07:00";
        String merchantTimeZone = "America/Chicago";

        // Parse the datetime string to a ZonedDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(datetimeStr, DateTimeFormatter.ISO_OFFSET_DATE_TIME);

        // Adjust to the specified merchant timezone (America/Chicago)
        ZonedDateTime merchantZonedDateTime = zonedDateTime.withZoneSameInstant(ZoneId.of(merchantTimeZone));

        // Convert to Instant (represents a point in time)
        Instant instant = merchantZonedDateTime.toInstant();

        // Convert Instant to Date object
        Date date = Date.from(instant);
        String datetimeStr1 = "2024-08-14 10:52:18";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Output the result
        System.out.println("Original ZonedDateTime: " + zonedDateTime);
        System.out.println("Merchant ZonedDateTime (America/Chicago): " + merchantZonedDateTime);
        System.out.println("Converted Date: " + date);

    }
}
