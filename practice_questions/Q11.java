package fuctional_Interface_practice.practice_questions;

import java.util.ArrayList;
import java.util.function.BiFunction;

// 1. Write a Java program to implement a lambda expression to find the
//    maximum and minimum values in a list of integers.
public class Q11 {
    public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
      list.add(56);
      list.add(42);
      list.add(902);
        list.add(43);
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(42);
        list.add(32);
        System.out.println(list);
        // min
       Integer min = list.stream().min((i1,i2) -> i1.compareTo(i2)).get();
        System.out.println(min);
        // max
        Integer max = list.stream().min((i1,i2) -> -i1.compareTo(i2)).get();
        System.out.println(max);

        // sum
        BiFunction<Integer,Integer,Integer> fin = (a,b) -> a+b;
        System.out.println("Result: "+fin.apply(4,7));
    }
}
