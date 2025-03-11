package stream;

import java.time.Duration;
import java.time.LocalTime;

public class DurationDemo {
    public static void main(String[] args) {
        LocalTime currentTime=LocalTime.now();
        LocalTime specifiedTime=LocalTime.of(10,0);

        Duration duration=Duration.between(specifiedTime,currentTime);

        System.out.println("hours difference : "+duration.toHours());
        System.out.println("time difference : "+duration.toMinutes());
    }
}
