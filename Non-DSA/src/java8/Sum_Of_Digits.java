package java8;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sum_Of_Digits {
    public static void main(String[] args){
        int i = 15623;

        Integer sum2 =
                Stream.of(String.valueOf(i).split("")).
                        collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sum2);
    }
}
