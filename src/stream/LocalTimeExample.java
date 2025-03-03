package stream;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);
        LocalDate now1 = LocalDate.now();
        System.out.println(now1);
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now2);
    }
}
