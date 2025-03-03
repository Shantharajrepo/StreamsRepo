package streamFadtare;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(1,2,3,4,4,5,6,6,7,7,8,9);
        integers.stream().distinct().forEach(System.out::println);
    }
}
