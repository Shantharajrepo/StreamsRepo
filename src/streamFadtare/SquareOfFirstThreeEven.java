package streamFadtare;

import java.util.Arrays;
import java.util.List;

public class SquareOfFirstThreeEven {

    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(1,2,3,4,4,5,6,6,7,7,8,9);

        integers.stream()
                .filter(n->n%2==0)
                .distinct()
                .limit(3)
                .map(n->n*n)
                .forEach(System.out::println);
    }
}
