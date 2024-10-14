package stream_practice;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Comparator;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class StudentMarks {
    public static void main(String[] args){

       /* // any values which are not part of array / collection
        Stream<Integer> str = Stream.of(1,22,55,77,99,8,8,76,43,456);
        str.forEach(System.out::println);
*/

        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(100);
        marks.add(200);
        marks.add(200);
        marks.add(200);
        marks.add(100);
        marks.add(100);
        marks.add(300);
        marks.add(300);
        marks.add(400);
        marks.add(300);
        System.out.println(marks);

        // collect distinct marks among all students
        List<Integer> distinct_marks = marks.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct_marks);

        // average

        // skip()
        List<Integer> skip = marks.stream().limit(3).collect(Collectors.toList());
        System.out.println(skip);

        // toArray() = stream object is convert to array
        Integer[] ar = marks.stream().toArray(Integer[] :: new);
        System.out.println("array of integer = "+Arrays.toString(ar));
        // operation on array using stream


        // forEach() method use
        Consumer<Integer> c = i -> System.out.println("square of "+i+" is = "+i*i) ;
        marks.stream().forEach(c);
        System.out.println(marks);

        // use lambda expression for sorting the list above
        /*Comparator<Integer> sortUsingComparator = (obj1,obj2) -> obj1 > obj2 ? -1 : obj1 < obj2 ? +1 :0;
        Collections.sort(marks,sortUsingComparator);
        System.out.println("after sorting by using lambda expression marks list = "+marks);*/

        // use this direct in stream
        List<Integer> l = marks.stream().sorted((a,b) -> (a > b) ? -1 : (a < b) ? +1 : 0 ).collect(Collectors.toList());
        System.out.println(" l = "+l);
        Integer min = marks.stream().min((i1,i2) -> i1.compareTo(i2)).get();
        System.out.println("min value = "+min);
        // sort the list
        List<Integer> sortedList = marks.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted marks list = "+sortedList);
        // add 5% marks in each student marks
        List<Integer> newMarks = marks.stream().map(a -> a+5).collect(Collectors.toList());
        System.out.println(newMarks);

        // failed students and add 5% marks on their marks
        List<Integer> failedStudents = marks.stream().filter(a -> a<=35  ).collect(Collectors.toList());
        System.out.println(failedStudents.stream().map(a -> a+5).collect(Collectors.toList()));


        ArrayList<String> list3 = new ArrayList<>();
        list3.add("map");
        list3.add("and");
        list3.add("saw");
        list3.add("apple");
        list3.add("mangow");
        list3.add("anagram");
        list3.add("string");
        list3.add("spring");
        list3.add("doing");
        list3.add("saw");
        list3.add("apple");
        list3.add("mangow");
        list3.add("anagram");
        list3.add("string");
        list3.add("s");
        System.out.println(list3);

        // anyMatch()  , allMatch() , noneMatch()
        if(list3.stream().anyMatch(a -> a.equals("s"))){
            System.out.println("match found = "+list3);
        }

        // customized sorting using lambda function
        Comparator<String> customSort = (a,b) -> (a.length()>b.length()) ? -1 : (a.length()<b.length())?+1 : 0;
        Collections.sort(list3,customSort);
        System.out.println("custom sorted list 3 using comparator = "+list3);

        // sort above list by natural order
        List<String> sortedList1 = list3.stream().sorted().toList();
        System.out.println("sorted list3 = "+sortedList1);

        // distinct() => remove duplicate elements from list
        System.out.println("after removing duplicates");
        List<String> list = list3.stream().filter(a ->a.startsWith("a")).collect(Collectors.toList());
        System.out.println(list);


        System.out.println("to upper case : "+list3.stream().map(s->s.toUpperCase()).collect(Collectors.toList()));

        List<String> listMap = list3.stream().map(b -> b.concat("java")).collect(Collectors.toList());
        System.out.println(listMap);
        System.out.println(listMap.stream().findAny());
        System.out.println(listMap.stream().findAny());



    }
}
