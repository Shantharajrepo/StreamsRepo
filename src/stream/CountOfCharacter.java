package stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountOfCharacter {
    public static void main(String[] args) {
        String s="java is a powwrful language in the world";

        String[] split = s.split("");

        Stream<String> sequential = Arrays.stream(split).sequential();
        Map<String, Long> collect = sequential.
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
