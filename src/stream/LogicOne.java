package stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LogicOne {
    public static void main(String[] args) {
        int[] input ={1,2,2,4};

        List<Integer> list = Arrays.stream(input)
                .boxed()
                .toList();

        HashSet<Integer> integers = new HashSet<>(list);

        boolean b = integers.size() == list.size() ? false : true;
        System.out.println(b);


    }
}
