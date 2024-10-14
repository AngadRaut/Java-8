package stream_practice;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class Basic {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(89);
        list.add(45);
        list.add(12);
        list.add(42);
        list.add(8);
        list.add(5);
        list.add(9);
        list.add(23);
        list.add(8);
        list.add(68);
        System.out.println(list);

     /*   iterating using iterator
       Iterator<Integer> iterList = list.iterator();
        while(iterList.hasNext()){
            Integer value = iterList.next();
            if(value>35){
                System.out.println(value);
            }
        }*/


        // sorted list
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted List = "+sortedList);
        System.out.println(list);

        // using lambda sort the given list
        list.sort((a,b) -> - a.compareTo(b));
        System.out.println("sorted using lambda = "+list);

        List<Integer> l =  list.stream().filter(i -> i % 2 == 0 ).toList();
        System.out.println(l);



    }
}
