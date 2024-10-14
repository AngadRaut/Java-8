package stream_practice.streammap;
import org.w3c.dom.ls.LSOutput;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stringToInteger extends Prime{
    public static void main(String[] args) {
        ArrayList<String> string_list = new ArrayList<>();
        string_list.add("5");
        string_list.add("12");
        string_list.add("97");
        string_list.add("10");
        string_list.add("11");
        string_list.add("2");
        string_list.add("2");
        string_list.add("5");
        string_list.add("57");
        string_list.add("9");
        System.out.println("string type list = "+string_list);

       // List<Integer> integer_list = string_list.stream().map(a->Integer.valueOf(a)).collect(Collectors.toList());
      //  List<Integer> integer_list = string_list.stream().map(a->Integer.parseInt(a)).collect(Collectors.toList());
      //  List<Integer> integer_list = string_list.stream().map(Integer::valueOf).collect(Collectors.toList());
        List<Integer> integer_list = string_list.stream().map(Integer::parseInt).distinct().collect(Collectors.toList());

        System.out.println("integer list = "+integer_list);

        // find the k'th smallest integer from list
        Integer kth_smallest = integer_list.stream().min((a,b) -> a.compareTo(b)).stream().skip(2).findFirst().get();
        System.out.println("max = "+kth_smallest);

        // find the square of each elements in integer list
        List<Integer> square_list = integer_list.stream().map(a -> a*a).collect(Collectors.toList());
        System.out.println("square list = "+square_list);


        // finding prime no from list
//        Integer prime_no = integer_list.stream().anyMatch(Integer :: isPrime).get();

        // forEach() in stream
        integer_list.stream().forEach(System.out::println );

      /*  // list to array
        double[] ar = integer_list.stream().mapToDouble(a -> a).toArray();
        System.out.println(Arrays.toString(ar));
        System.out.println(ar[4]);*/

        /*List<Integer> half = integer_list.stream().map(a -> a/2).collect(Collectors.toList());
        System.out.println(half);*/
    }
}
