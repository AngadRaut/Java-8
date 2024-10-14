package fuctional_Interface_practice;


import java.util.ArrayList;
import java.util.function.BiPredicate;

public class BiPredicateDemo {
    static String str1 = "123";
//   static  String str2="Angada";
   static Integer str2 = 123;

    public static void main(String[] args) {
        BiPredicate<String, Integer> bipredicate = (s1, s2) -> s1.equals(s2);
        System.out.println(bipredicate.test(str1, str2));
        BiPredicate<Integer, Integer> isEven = (a, b) -> a % 2 == 0 && b % 2 == 0;
        BiPredicate<Integer, Integer> sum = (a, b) -> (a + b) < 10;
        System.out.println("both are even : " + isEven.test(2, 6));
        System.out.println("sum is < 10 : " + sum.test(5, 2));

        ArrayList<String> list = new ArrayList<>();
        list.add("shubham");
        list.add("nana");
        list.add("pandya");
        list.add("rajni");
        list.add("tatya");
        list.add("mauli");
        System.out.println("list = " + list);

        for (String s : list) {
            BiPredicate<String, Integer> isLengthGreaterThan = (a, b) -> (a.length() > b);
            if (isLengthGreaterThan.test(s, 4)) {
                System.out.println(s);
            }
        }
    }
}
