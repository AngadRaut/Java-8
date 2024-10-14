package stream_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountOccurence {
    public static void main(String[] args) {
        long  count = 0;
//        List<String> list = Arrays.asList("java","programming","object","oriented","java");

        String str = "java programming java language";

        List<Integer> l = Arrays.asList(1,2,3,4,5,66,7,80,90,23,4,56,54,32,21,12,12,12);
        List<Integer> sorted  = l.stream().sorted().collect(Collectors.toUnmodifiableList());

        /*
//        System.out.println(sorted);
       // List<Integer> reverse_sort = l.stream().sorted((a,b) -> - a.compareTo(b) ).collect(Collectors.toUnmodifiableList());
        List<Integer> reverse_sort = l.stream().sorted(Comparator.reverseOrder()).toList();
       List<Integer> i =  l.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).collect(Collectors.toUnmodifiableList());
        System.out.println("2nd largest= "+i);
        System.out.println(reverse_sort);



        // max and min in list
        Integer max = l.stream().max((a,b) -> a.compareTo(b)).get();
        Integer min = l.stream().min((a,b) -> a.compareTo(b)).get();
        System.out.println("max = "+max+" min = "+min);


*/


       /* // frequency of each character in string
        char[] char_array = str.toCharArray();
        List<Character> char_list = Stream.of(char_array);
        Long count = char_array.stream().filter(a -> a.char_array("j")).count();
        System.out.println(count);*/


    }
}
