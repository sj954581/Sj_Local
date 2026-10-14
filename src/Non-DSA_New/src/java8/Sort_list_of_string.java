package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_list_of_string {
    public static void main(String[] args){
       List<String> list = Arrays.asList("java","python","C","C#");
       List<String> sortedList =
       list.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
       System.out.println(sortedList);
    }
}
