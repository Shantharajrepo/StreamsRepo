package stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapPractice {

    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("java",2);
        map.put("program",5);
        map.put("preethijintha",7);
        map.put("guru",1);

//        for (Map.Entry<String,Integer> s: map.entrySet())
//
//            System.out.println(s);

//        Map.Entry<String, Integer> stringIntegerEntry = map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
//        System.out.println(stringIntegerEntry.getKey());


        String s="banana";

        Map<Character, Long> collect = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map.Entry<Character, Long> stringIntegerEntry = collect.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(stringIntegerEntry.getKey());




    }


}
