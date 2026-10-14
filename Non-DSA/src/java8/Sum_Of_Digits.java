package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sum_Of_Digits {
    public static void main(String[] args){
        int i = 15623;
        int j = 15623;
        int[] k = {1,5,6,2,3};

        Integer sum1 = Stream.of(String.valueOf(i).split("")).
                        collect(Collectors.summingInt(Integer::parseInt));

        int sum2 = Arrays.stream(k).sum();

        Double avg1 = Stream.of(String.valueOf(i).split("")).
                collect(Collectors.averagingDouble(Double::parseDouble));

        double avg2 = Arrays.stream(k).average().getAsDouble();

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(avg1);
        System.out.println(avg2);
    }
}
