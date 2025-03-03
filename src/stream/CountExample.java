package stream;

import java.util.Arrays;
import java.util.List;

public class CountExample {
    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(1,2,3,4,5,5,5,5,3,2,2,4);

        long count = integers.stream()
                .count();
        System.out.println(count);
    }
}
