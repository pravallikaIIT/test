import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
// Step 1: Define the merchant's time zone dynamically
        String merchantTimeZone = "America/Chicago";
       // String merchantTimeZone = "Asia/Calcutta";
//        String merchantTimeZone = "Pacific/Honolulu";
// This could be dynamically retrieved// Step 2: Get the current time directly in the merchant's time zone
        ZonedDateTime merchantTime = ZonedDateTime.now(ZoneId.of(merchantTimeZone));
        System.out.println("merc---------- "+merchantTime);
// Step 3: Format the date-time to HH:mm
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedMerchantTime = merchantTime.format(formatter);

        LocalTime now = LocalTime.parse(formattedMerchantTime, formatter);
        LocalTime plusFiveMinutes = now.plusMinutes(5);
        String formattedTime = String.format("%02d:%02d", plusFiveMinutes.getHour(), plusFiveMinutes.getMinute());
// Output the result
        System.out.println("Merchant Time: " + formattedTime); }
}
