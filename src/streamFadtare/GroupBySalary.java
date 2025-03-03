package streamFadtare;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBySalary {
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee(1,"adi",500000L));
        employees.add(new Employee(2,"shantha",200000L));
        employees.add(new Employee(3,"deepak",300000L));
        employees.add(new Employee(4,"Kiran",300000L));
        employees.add(new Employee(5,"manoj",800000L));
        employees.add(new Employee(6,"usha",200000L));

        Map<Long, List<Employee>> collect = employees.stream()
                .collect(Collectors.groupingBy(e -> e.getSalary()));
        System.out.println(collect);
    }
}
