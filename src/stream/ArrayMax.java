package stream;

import java.util.Arrays;
import java.util.OptionalInt;

public class ArrayMax {
    public static void main(String[] args) {

        int[] a={3,5,2,1,7,8,9,99};
        int asInt = Arrays.stream(a).max().getAsInt();
        System.out.println(asInt);

    }
}
