package stream_practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ArrayProblemsStream {
    public static void main(String[] args) {
        Integer [] ar = { 1,2,3,4,5,6,1,2,3,4,5,6,1,2,3,4,5,6};
        // convert array to list
//        List<Integer> list = Stream.of(ar).forEach(System.out::println);

        List<Integer> l =Arrays.asList(ar);
        System.out.println(l);
        Map<Integer , Long> map = l.stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));
        System.out.println(map);

         String s = "javaProgrammingisbest";

         char[] ch = s.toCharArray();
        List<Character> li = new ArrayList<>();
        for(char k : ch){
            li.add(k);
        }
        System.out.println("list "+li);
        Map<Character,Long> o = li.stream().collect(Collectors.groupingBy(a -> a , Collectors.counting()));
        System.out.println(o);


      /*   Set<Character> set = new HashSet<>();
         for(char c : ch){
             set.add(c);
        }
        System.out.println(set);*/
    }
}
