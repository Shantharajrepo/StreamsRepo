package streamFadtare;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(1,2,3,4,4,5,6,6,7,7,8,9);

        Integer i = integers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(i);
    }
}
