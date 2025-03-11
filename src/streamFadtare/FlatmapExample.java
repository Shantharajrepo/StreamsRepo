package streamFadtare;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapExample {
    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("Amit", "Ankit"),
                Arrays.asList("Sneha", "Sonia"),
                Arrays.asList("Ravi", "Ramesh")
        );


        List<String> flatList = nestedList.stream()
                .flatMap(List::stream)  // Flattens nested structure
                .collect(Collectors.toList());

        System.out.println(flatList);  // Output: [Amit, Ankit, Sneha, Sonia, Ravi, Ramesh]
    }
}
