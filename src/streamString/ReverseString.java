package streamString;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        String word="hello";

        StringBuilder stringBuilder=new StringBuilder(word).reverse();
        System.out.println(stringBuilder.toString());



        Stream<Character> charStream = Stream.of('j', 'a', 'v', 'a');
        String collect = charStream.map(c -> String.valueOf(c))
                .collect(Collectors.joining());
        System.out.println(collect);
    }
}
