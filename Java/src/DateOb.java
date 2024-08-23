import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class DateOb {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
        // Define the desired date format with timezone
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Set the timezone (e.g., America/Chicago)
        dateFormat.setTimeZone(TimeZone.getTimeZone("America/Chicago"));

        // Convert the Date object to a String in the specified format with timezone
        String dateString = dateFormat.format(date);
        System.out.println(dateString);
        String endDateMax = "2100-01-01T10:10:10-07:00";
        ZonedDateTime originalDateTime = ZonedDateTime.parse(endDateMax);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(originalDateTime.format(formatter));
        if(originalDateTime.format(formatter).length() == (dateString.length())) {
            System.out.println("check");
        }
        String dateString1 = dateFormat.toString();
    }
}
