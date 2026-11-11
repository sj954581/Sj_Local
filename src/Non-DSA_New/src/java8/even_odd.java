package java8;

import java.lang.*;
import java.util.*;
import java.util.stream.Collectors;

public class even_odd {
    public static void main(String[] args){
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);

        int[] numbers = {10, 15, 22, 33, 40, 55, 60};

        Map<Boolean,List<Integer>> listMap =
                list.stream().collect(Collectors.partitioningBy(i -> i%2 == 0));

        List<Integer> oddList = list.stream().
                filter(i -> i%2 != 0).collect(Collectors.toList());

        List<Integer> evenList = list.stream().
                filter(j -> j%2 ==0).collect(Collectors.toList());

        System.out.println("Odd Numbers" + oddList);
        System.out.println("even Numbers" + evenList);
        System.out.println(listMap);

        // Find and print Even numbers
        System.out.println("Even numbers From Array : ");
        Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        List<Integer> evenArray33 =  Arrays.stream(numbers)
                .filter(n -> n % 2 == 0).boxed()
                        .collect(Collectors.toList());

        System.out.println("Even numbers From evenArray33 : " + evenArray33);

        System.out.println(); // New line

        // Find and print Odd numbers
        System.out.println("Odd numbers From Array : ");
        Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)
                .forEach(n -> System.out.print(n + " "));

        Map<Boolean, List<Integer>> partitionedMap = Arrays.stream(numbers)
                .boxed() // Converts IntStream to Stream<Integer>
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> evenNumbers = partitionedMap.get(true);
        List<Integer> oddNumbers = partitionedMap.get(false);

        System.out.println("Even numbers From Array2 : " + evenNumbers);
        System.out.println("Odd numbersFrom Array2 : " + oddNumbers);

        int number = 12345678;
        Map<Boolean, List<Integer>> result = String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .boxed()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Odd numbersFrom result number : " + result);
    }
}
