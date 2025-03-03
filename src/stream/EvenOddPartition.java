package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddPartition {

    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(1,2,3,4,5,6,7,8,9,2,44,55,66,77,88,34,56,21);

        Map<Boolean, List<Integer>> collect = integers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        collect.forEach((k,v)->{
            System.out.println(k);
            System.out.println(v);
            if(k){
                System.out.println("even numbers");
                System.out.println(v);
            }
        });


    }
}
