package stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfIndividualDigits {
    public static void main(String[] args) {
        int num=1234;
        String s = String.valueOf(num);
        System.out.println(s);
        String[] split = s.split("");
        Stream<String> stream = Arrays.stream(split);
 //       Stream<Integer> integerStream = stream.map(i -> Integer.parseInt(i));
//        Integer reduce = integerStream.reduce(0, (a, b) -> a + b);

        int add = stream.mapToInt(a -> Integer.parseInt(a)).sum();
        System.out.println(add);

    }
}
