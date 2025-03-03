package streamFadtare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortEmpBySal {

    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee(1,"adi",500000L));
        employees.add(new Employee(2,"shantha",200000L));
        employees.add(new Employee(3,"deepak",300000L));
        employees.add(new Employee(4,"Kiran",400000L));
        employees.add(new Employee(5,"manoj",800000L));

//        employees.stream()
//                .sorted(Comparator.comparing(e->e.getSalary()))
//                .forEach(System.out::println);

        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .forEach(System.out::println);

    }


}
