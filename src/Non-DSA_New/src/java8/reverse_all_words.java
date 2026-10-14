package java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class reverse_all_words {
    public static void main(String[] args){

        String str1 = "java Concept Of The Day";
        String str2 = Stream.of(str1.split(" ")).
                map(word -> new StringBuffer(word).reverse()).
                collect(Collectors.joining(" "));

        System.out.println(str2);
    }
}
