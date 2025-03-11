package stream;

import java.time.LocalDate;

public class LocalDateDemo {

    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        System.out.println("today : "+today);
        LocalDate specificDate=LocalDate.of(2001,6,10);
        System.out.println("specificDate : "+specificDate);

        System.out.println("year : "+ today.getYear());
        System.out.println("month : "+ today.getMonth().getValue());
        System.out.println("day of month : "+ today.getDayOfMonth());
    }

}
