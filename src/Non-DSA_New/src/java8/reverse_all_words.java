package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class reverse_all_words {
    public static void main(String[] args){

        String str1 = "java Concept Of The Day";
        String str2 = Stream.of(str1.split(" ")).
                map(word -> new StringBuffer(word).reverse()).
                collect(Collectors.joining(" "));

        System.out.println(str2);

        int[] arr = new int[] {5,1,7,3,9,6};
        List<Integer> list = Arrays.asList(5,1,7,3,9,6);
        System.out.println("###### Printing array below ######");

        IntStream.range(0, arr.length)
                .map(i -> arr[arr.length-1 - i])
                .forEach(System.out::println);

        System.out.println("###### Printing list below ######");

        list.stream().sorted(Comparator.reverseOrder()).
                forEach(System.out::println);
    }
}
