package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraysProgram {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1};
        List<Integer> list = Arrays.stream(a).boxed().toList();

        List<Integer> collect = list.stream().distinct().toList();

        if(collect.size()== list.size()){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }


//        }

    }
}
