package java8;

import java.lang.*;
import java.util.*;
import java.util.stream.Collectors;

public class even_odd {
    public static void main(String[] args){
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        Map<Boolean,List<Integer>> listMap =
                list.stream().collect(Collectors.partitioningBy(i -> i%2 == 0));

        List<Integer> oddList = list.stream().
                filter(i -> i%2 != 0).collect(Collectors.toList());

        List<Integer> evenList = list.stream().
                filter(j -> j%2 ==0).collect(Collectors.toList());

        System.out.println("Odd Numbers" + oddList);
        System.out.println("even Numbers" + evenList);
        System.out.println(listMap);
    }
}
