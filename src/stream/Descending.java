package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Descending {
    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(1,2,3,4,5,5,5,5,3,2,2,4,6);

        integers.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .forEach(System.out::println);
    }
}
