package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Max {

    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(1,2,3,4,5,5,5,5,3,2,2,4,6);

//        Integer i = integers.stream()
//                .max(Comparator.naturalOrder())
//                .get();
        Integer i = integers.stream()
                        .max(Comparator.comparingInt(Integer::intValue))
                .get();
        System.out.println(i);
    }
}
