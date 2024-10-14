package stream_practice.streammap;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class concatList {
    public static void main(String[] args) {
        List<String> string_list = new ArrayList<>();
        string_list.add("java");
        string_list.add("programming");
        string_list.add("mulTIThreaded");
        string_list.add("java123");
        string_list.add("programming123");
        string_list.add("exception handeling");
        string_list.add("robust");
        string_list.add("PROGRAMMING");
        string_list.add("MULTITHREADED");

        string_list.add("programming");
        string_list.add("mulTIThreaded");
        string_list.add("java123");
        string_list.add("programming123");
        string_list.add("exception handeling");
        string_list.add("robust");
        System.out.println("string_list = "+string_list);

        // find the frequency of each string in given list
        Map<String,Long> fre = string_list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(fre);


       /* List<String> sorted_list = string_list.stream().sorted().collect(Collectors.toList());
        System.out.println("\nsorted_list = "+sorted_list);

        // to upper case and toLowerCase
        List<String> toUpperCase_list = string_list.stream().map(a -> a.toUpperCase()).sorted().collect(Collectors.toUnmodifiableList());
        System.out.println("\nto upper case sorted list = "+toUpperCase_list);
        List<String> toLowerCase_list = string_list.stream().map(a -> a.toLowerCase()).sorted().collect(Collectors.toUnmodifiableList());
        System.out.println("\nlower case sorted list "+toLowerCase_list);

        // sort by length
        List<String> sortByIncLength = string_list.stream().sorted((a,b) -> a.length() > b.length() ? 1 : a.length() < b.length() ? -1 : 0 ).collect(Collectors.toUnmodifiableList());
        System.out.println("\nlist sorted by increasing length = "+sortByIncLength);
        List<String> sortByDecLength = string_list.stream().
                sorted((a,b) -> a.length() > b.length() ? -1 : a.length() < b.length() ? 1 : 0).
                collect(Collectors.toList());
        System.out.println("\nlist sorted by decreasing length = "+sortByDecLength);


         // find the longest string in given list of string
        List<String> longest_string =  string_list.stream().
                sorted((a,b) -> a.length() > b.length() ? -1 : a.length() < b.length() ? 1 : 0).
                limit(1).collect(Collectors.toUnmodifiableList());
        System.out.println("\nlongest string using sorted,limit,collect method's = "+longest_string+"\n");


        // shortest string using comparingInt
        String shortest_string = string_list.stream().min(Comparator.comparingInt(String :: length)).get();
        System.out.println("(min function used which gives comparator )shortest string from given string is = "+shortest_string);


        // longest list from given list of string
        String longest_stringUsingMax = string_list.stream().max(Comparator.comparingInt(a -> a.length())).get();
//        String longest_stringUsingMax1 = string_list.stream().mapToInt((a,b) ->)
        System.out.println("(max function used which gives comparator )longest string from given string is = ");
*/
      /*  List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(11);
        list1.add(21);
        list1.add(3);
        list1.add(22);
        list1.add(34);
        list1.add(56);
        list1.add(14);
        list1.add(67);
        list1.add(89);
        list1.add(90);
        list1.add(43);
        System.out.println(list1);
        // getting min and max values in above list
        Integer min = list1.stream().min((a,b) -> a.compareTo(b)).get();
        System.out.println("min value is = "+min);

        Integer max = list1.stream().max((a,b) -> a.compareTo(b)).get();
        System.out.println("max = "+max);
// list to array
        List<String> integerToString_list = list1.stream().map(Objects::toString).collect(Collectors.toList());
        System.out.println("string list = "+integerToString_list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(56);
        list2.add(89);
        list2.add(45);
        list2.add(78);
        list2.add(98);
        list2.add(67);
        list2.add(56);
        list2.add(90);
        list2.add(78);
        list2.add(8);
        list2.add(4);
        list2.add(8);
        System.out.println(list2);
        // add list1 and list2 in third list
        List<Integer> list3 = Stream.concat(list1.stream(),list2.stream()).sorted().distinct().collect(Collectors.toUnmodifiableList());
        System.out.println(list3);*/

    }
}
