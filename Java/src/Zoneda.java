import java.util.Date;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Zoneda {
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
        // Define the target timezone (e.g., America/Chicago)
        String targetTimeZone = "America/Chicago";

        // Convert Date to Instant
        Instant instant1 = date.toInstant();

        // Convert Instant to ZonedDateTime in the target timezone
        ZonedDateTime zonedDateTime1 = instant1.atZone(ZoneId.of(targetTimeZone));

        // Output the result
        System.out.println("Original Date: " + date);
        System.out.println("ZonedDateTime in " + targetTimeZone + ": " + zonedDateTime);

        // Optional: Convert ZonedDateTime back to Date (if needed)
        Date dateInTargetZone = Date.from(zonedDateTime.toInstant());
        System.out.println("Converted Date: " + dateInTargetZone);


        ZoneId zoneId = ZoneId.of("America/Chicago");

        // Convert Date to Instant
        Instant instant11 = dateInTargetZone.toInstant();

        // Convert Instant to ZonedDateTime in the specified timezone
        ZonedDateTime zonedDateTime11 = instant11.atZone(zoneId);
        System.out.println("Converted Date: " + zonedDateTime11);

    }

    public static String convertDateToString(Date date, String merchantTimeZone) {
        ZoneId zoneId = ZoneId.of(merchantTimeZone);
        Instant instant = date.toInstant();
        ZonedDateTime zonedDateTime = instant.atZone(zoneId);
        return zonedDateTime.toString();
    }
}
