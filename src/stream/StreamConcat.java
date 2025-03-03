package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamConcat {

    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(1,2,3,4,5);
        List<Integer> integers1=Arrays.asList(6,7,8,9);
        Stream<Integer> concat = Stream.concat(integers.stream(), integers1.stream());
        concat.forEach(System.out::println);
    }
}
