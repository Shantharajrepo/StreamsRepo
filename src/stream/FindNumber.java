package stream;

import java.util.Arrays;
import java.util.List;

public class FindNumber {

    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(1,2,3,4,5,6,7,8,9,2,44,55,66,77,88,34,56,21);

        integers.stream()
                .map(n->n.toString())
                .filter(s->s.startsWith("2"))
                .forEach(System.out::println);

    }

}
