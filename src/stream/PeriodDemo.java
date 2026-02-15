package stream;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {
        LocalDate birthDate=LocalDate.of(1998,1,26);
        LocalDate todayDate=LocalDate.now();

        Period period=Period.between(birthDate,todayDate);

        System.out.println("years : "+period.getYears());
        System.out.println("months : "+period.getMonths());
        System.out.println("days : "+period.getDays());
    }
}
