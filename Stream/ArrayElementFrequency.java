package stream_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Map;


public class ArrayElementFrequency {
    public static void main(String[] args) {
        int [] ar = {1,2,3,4,5,6,1,2,3,4,5,6,4,5,6};
        int count = 0;




    /*    // find the frequency of each element in array
        for(int i = 0 ; i < ar.length -1 ;i++){
            for(int j = i + 1 ; j < ar.length ; j++){

            }
        }*/


        // find frequency of each element in array
        List<Integer> list = new ArrayList<>();
        for(Integer i : ar){
            list.add(i);
        }

        Map<Integer,Long> m = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(m);

         // sum and average of all elements
        Double sum = list.stream().mapToDouble(a -> a).sum();
        Integer avg = list.stream().reduce(Integer::sum).get();

        Double avg2 = list.stream().collect(Collectors.averagingDouble(a->a));
        System.out.println(avg2);

        System.out.println(sum);

        System.out.println(list);


        // find duplicate elements from elements
        List<Integer> remove_duplicates = list.stream().distinct().collect(Collectors.toUnmodifiableList());
        System.out.println(remove_duplicates);

    }
}
