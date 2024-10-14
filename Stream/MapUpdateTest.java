package stream_practice.streammap;
import java.util.*;
import java.util.stream.Collectors;

public class MapUpdateTest {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<String,String>();
        map.put("Effective Java", "Kathy Sierra");
        map.put("Spring in Action", "Craig Walls");
        map.put("Hibernate in Action", "Gavin King");
        map.put("Pro Angular", "Freeman");
        map.put("Pro Spring Boot", "Felipe Gutierrez");
        System.out.println(map);

        // How to iterate and modify values in a Map using Java 8 ?
       List<String> list_keys = map.entrySet().stream().map(a -> a.getKey()).collect(Collectors.toUnmodifiableList());
//        System.out.println(list);
       map.keySet( ).stream().iterator().forEachRemaining(System.out::println);
       List<String> list_values = map.values().stream().toList();
       map.values().stream().iterator().forEachRemaining(System.out::println);
//        System.out.println("list of keys = "+list);

        // c) by using Collections.iterator()
      /*  System.out.println(map.keySet().toString());
        System.out.println(map.values());*/

        // b) by using forEach loop
      /*  System.out.println("keys in map = ");
        for(String s : map.keySet() ){
            System.out.println(s);
        }
        System.out.println("\nvalues in map =  ");
        for(String s : map.values() ){
            System.out.println(s);
        }*/
        System.out.println();


        // a) by using iterator and keySet<> iterating keys
//        Set<String> key_set = map.keySet();
//        Iterator<String> itr = key_set.iterator();

      /*  Iterator<String> itr = map.keySet().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }*/
        System.out.println();

        // iterating values

     /*   Iterator<String> iteratr_values = map.values().iterator();
        while(iteratr_values.hasNext()){
            System.out.println(iteratr_values.next());
        }*/


    }
}
