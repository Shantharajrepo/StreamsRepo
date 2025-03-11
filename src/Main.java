import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        String s[]={"madam","dog"};

//         Arrays.stream(s)
//                .filter(w->w.equals(new StringBuilder(w).reverse().toString()))
//                .forEach(n->System.out.println(n));


//        String s1 = Arrays.stream(s)
//                .max(Comparator.comparingInt(w -> w.length()))
//                .get();
//        System.out.println(s1);

//        LocalDate localDate=LocalDate.now();
//        System.out.println(localDate);
//        System.out.println(localDate.getDayOfWeek());
//        System.out.println(localDate.getMonthValue());
//        System.out.println(localDate.getMonth().toString());
//        System.out.println(localDate.getDayOfMonth());
//        System.out.println(localDate.getYear());
//        System.out.println(localDate.getDayOfYear());
//        String format = String.format("%d-0%d-%d", localDate.getDayOfMonth(), localDate.getMonthValue(), localDate.getYear());
//
//        System.out.println(format);
//
//        String format1 = String.format("%d-%s-%d", localDate.getDayOfMonth(), localDate.getMonth(), localDate.getYear());
//
//        System.out.println(format1);
//
//        LocalTime localTime=LocalTime.now();
//        System.out.println(localTime);
//        LocalDateTime localDateTime=LocalDateTime.now();
//        System.out.println(localDateTime);
//
//        List<List<String>> nestedList = Arrays.asList(
//                Arrays.asList("apple","mango"),
//                Arrays.asList("banana","guava"),
//                Arrays.asList("alwa","dosa"));
//
//        List<String> collect = nestedList.stream()
//                .flatMap(list -> list.stream())
//                .collect(Collectors.toList());
//        System.out.println(collect);

       String s="java is a powerful programming language java is my favourite";
       String p="python";
       String j="java";

    String result =Arrays.stream(s.split(" "))
               .map(a->a.equals(j )? p : a)
               .collect(Collectors.joining(" "));

        System.out.println(result);






    }
    }
