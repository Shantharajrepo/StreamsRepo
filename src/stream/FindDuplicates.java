package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<String> strings= Arrays.asList("aa","bb","bb","cc");
        Map<String, Long> collect = strings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        for (Map.Entry<String, Long> entries:collect.entrySet()){
            if(entries.getValue()>1){
                Map<String,Long> stringLongMap=new HashMap<>();
                stringLongMap.put(entries.getKey(),entries.getValue());
                System.out.println(stringLongMap);
            }
        }
    }
}
