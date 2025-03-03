package streamFadtare;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWord {
    public static void main(String[] args) {
        String s="hello world java";

        String[] s1 = s.split(" ");


        String collect = Arrays.stream(s1).
                map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(collect);
    }
}
