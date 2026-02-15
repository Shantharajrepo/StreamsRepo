package stream;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo {

    public static void main(String[] args) {
        ZonedDateTime currentZone=ZonedDateTime.now();
        System.out.println("Current ZoneTime :"+currentZone);

        ZonedDateTime specificZone=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("specific zone : "+specificZone);
    }

}
