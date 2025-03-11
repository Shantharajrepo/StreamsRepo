package streamString;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String word=" hello";

        String string = word.chars()
                .mapToObj(c -> String.valueOf( (char) c))
                .distinct()
                .collect(Collectors.joining());
        System.out.println(string);



    }
}
