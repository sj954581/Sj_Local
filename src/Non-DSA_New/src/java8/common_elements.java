package java8;

import java.util.Arrays;
import java.util.List;

public class common_elements {
    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(1,3,5,7,9,11);
        List<Integer> list2 = Arrays.asList(1,3,7,9);

        list1.stream().
                filter(list2::contains).forEach(System.out::println);
    }
}
