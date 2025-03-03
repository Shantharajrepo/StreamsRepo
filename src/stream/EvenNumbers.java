package stream;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {

    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(1,2,3,4,5,6,7,8,9,2,44,55,66,77,88,34,56,21);

        integers.stream()
                .filter(n->n%2==0)
                .distinct()
                .forEach(System.out::println);
    }
}
