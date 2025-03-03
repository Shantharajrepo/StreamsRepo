package streamFadtare;

import java.util.Arrays;
import java.util.List;

public class Average {
    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(1,2,3,4,5,6,7,8,9);

        double asDouble = integers.stream()
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(asDouble);

    }
}
