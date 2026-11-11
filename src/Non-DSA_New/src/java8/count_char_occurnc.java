package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class count_char_occurnc {
    public static void main(String[] args){
        List<String> list = List.of("a","b","a","c","d","c");
        Map<String, Long> frequencyMap = list.stream()
                .collect(Collectors.groupingBy
                        (Function.identity(), Collectors.counting()));
        System.out.println(frequencyMap);

        String string = "abacdc";
        Map<Character, Long> frequencyMap2 =
        string.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy
                        (Function.identity(),Collectors.counting()));

        System.out.println(frequencyMap2);

        String[] strArray = {"a","b","a","c","d","c"};
        Map<String, Long> frequencyMap3 = Arrays.stream(strArray)
                .collect(Collectors.groupingBy
                        (Function.identity(), Collectors.counting()));
        System.out.println(frequencyMap3);
    }
}
