package stream_practice;
import java.util.ArrayList;

public class StreamMethods {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("David");
        names.add("Johnson");
        names.add("Samontika");
        names.add("Brijesh");
        names.add("John");
        names.add("Johnson");
        names.add("Samontika");
        names.add("Brijesh");
        names.add("AA");
        names.add("Bcd");
        names.add("ZXC");
        System.out.println(names);

/*        // sorting
        List<String> sortedList = names.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(sortedList);*/

        /* // customized sorting order
        Comparator<String> d = (a,b) ->  a.compareTo(b);
        Collections.sort(names,d);
        System.out.println(names);*/

//        List<String> sortCustom = names.stream().filter((a,b) -> a.compareTo(b)).collect(Collectors.toList();

         /*// map
         names.stream().map(String::length).forEach(System.out::println);
        */

        /*// skip
        List<String> skip = names.stream().skip(2).collect(Collectors.toList());
        System.out.println(skip);*/

        /*// limit
        List<String> limit = names.stream().limit(2).collect(Collectors.toList());
        System.out.println(limit);*/

      /*  // distinct = removes duplicates
        List<String> distinct = names.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct);*/

       /* // filter method
        List<String> lengthSort = names.stream().filter(a -> a.length()>6).collect(Collectors.toList());
        System.out.println("list having length > 6 is = "+lengthSort);*/
    }
}
