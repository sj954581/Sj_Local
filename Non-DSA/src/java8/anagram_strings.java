package java8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class anagram_strings {
    public static void main(String[] args){
        String str1 = "jojo";
        String str2 = "ojoj";

        str1 = Stream.of(str1.split("")).
                sorted().collect(Collectors.joining());

        str2 = Stream.of(str2.split("")).
                sorted().collect(Collectors.joining());

        String str3 = Stream.of(str2.split(""))
                .sorted().collect(Collectors.joining());

        if(str1.equals(str2)){
            System.out.println("Anagram Strings -> " + str1 + " " + str2);
        }else{
            System.out.println("NOT Anagram Strings -> "+ str1 + " " + str2);
        }

        if(str1.equals(str3)){
            System.out.println("Anagram Strings New -> " + str1 + " " + str3);
        }else{
            System.out.println("NOT Anagram Strings New -> "+ str1 + " " + str3);
        }
    }
}
