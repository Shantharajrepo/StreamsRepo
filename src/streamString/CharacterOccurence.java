package streamString;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class CharacterOccurence {
    public static void main(String[] args) {
        String word="hello";

        Map<Character, Long> collect = word.chars()
                .mapToObj(a -> (char) a)
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                ));
        collect.forEach((a,b)-> System.out.println(a+"--->"+b));

    }
}
