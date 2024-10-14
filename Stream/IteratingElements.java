package collection.map;

import java.beans.Introspector;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.SortedMap;




interface Sameer{
    String name (String s);
}
public class IteratingElements {
    public static void main(String[] args) {

        Sameer  s = (t) -> t.toUpperCase();
        System.out.println(s.name("nana"));
      /*
        Map<String,Integer> map = new HashMap<>();
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
        System.out.println(map);

        // iterating elements from map
        // 1. using forEach loop
        for(Map.Entry<String, Integer> m : map.entrySet()){
            System.out.println(m);
        }
        System.out.println();

        // 2. by using iterator
        Iterator<String> itr = map.keySet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();

        // iterator both entry and values
        Iterator<Map.Entry<String,Integer>> ma = map.entrySet().iterator();
        while (ma.hasNext()){
            System.out.println(ma.next());
        }
        System.out.println();

        // 3. by using java 8 forEach() method
        map.forEach((String,Integer) -> System.out.println(String+","+Integer));
*/
    }
}
