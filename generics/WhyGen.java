package generics;

import java.util.ArrayList;

class Test<T>{

}
public class WhyGen {
    public static void main(String[] args) {
        Test<String> t = new Test<String>();
        Test<Integer> t2 = new Test<Integer>();

        ArrayList <Object>ar = new ArrayList<>();
        ar.add("string");
        ar.add("java");
        ar.add(2000);
        System.out.println(ar);

        // try to access ar list elements
        for (Object obj : ar) {
            if (obj instanceof String) {
                String s1 = (String) obj;
                System.out.println(s1);
            }
        }

      /*  for(String s1 : ar){
            System.out.println(s1);
        }*/

    }
}
