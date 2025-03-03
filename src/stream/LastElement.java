package stream;

import java.util.Arrays;
import java.util.List;

public class LastElement {

    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(1,2,3,4,5,6,7,8,9,2,44,55,66,77,88,34,56,21);

        integers.stream()
                .skip(integers.size()-1)
                .forEach(System.out::println);
    }
}
