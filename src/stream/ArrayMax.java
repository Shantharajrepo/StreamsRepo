package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class ArrayMax {
    public static void main(String[] args) {

        int[] a={3,5,2,1,7,8,9,99};
//        int asInt = Arrays.stream(a).max().getAsInt();
//        System.out.println(asInt);

//        Integer i = Arrays.stream(a).boxed()
//                .max(Comparator.comparingInt(Integer::intValue))
//                .get();
//        System.out.println("max element-->"+i);

        Arrays.stream(a).boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


    }
}
