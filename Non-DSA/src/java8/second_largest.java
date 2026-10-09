package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class second_largest {
    public static void main(String[] args){
       List<Integer> list = Arrays.asList(45,12,56,76,15,24,75,31,89);
       int result =
               list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
       System.out.println(result);
    }
}
