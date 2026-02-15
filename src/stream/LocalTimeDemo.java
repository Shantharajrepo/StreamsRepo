package stream;

import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {
        LocalTime timeNow=LocalTime.now();
        System.out.println("Current Time : "+ timeNow);

        LocalTime specificTime=LocalTime.of(10,30);
        System.out.println("Specific Time : "+ specificTime);

    }
}
