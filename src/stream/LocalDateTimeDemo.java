package stream;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime dateTimeNow= LocalDateTime.now();
        System.out.println("Current date time : "+dateTimeNow);

        LocalDateTime customDateTime= LocalDateTime.of(2025,6,24,10,30);
        System.out.println("Custom date time : "+customDateTime);
    }
}
