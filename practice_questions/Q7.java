package fuctional_Interface_practice.practice_questions;

import java.util.ArrayList;
import java.util.Iterator;

// Write a Java program to implement a lambda expression to remove duplicates
// from a list of integers.
public class Q7 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(89);
        marks.add(90);
        marks.add(35);
        marks.add(56);
        marks.add(67);
        marks.add(59);
        marks.add(44);
        marks.add(34);
        marks.add(67);
        marks.add(35);
        marks.add(55);
        marks.add(67);
        marks.add(59);
        marks.add(44);
        marks.add(34);
        marks.add(67);
        marks.add(65);
        System.out.println(marks);

       /* //7) Given a list of students, write a Java 8 code to partition the students
        //   who got above 60% from those who didn’t?
        List<Integer> above = marks.stream().filter(a -> a>60).collect(Collectors.toList());
        System.out.println(above);

        // sum of all nos
        Integer sum2  = marks.stream().reduce(Integer::sum).get();
        System.out.println("sum = "+sum2);

        // sum of square of all nos is =
        Integer sum = marks.stream().mapToInt(a->a*a).reduce(Integer::sum).getAsInt();
        System.out.println("sum of square of  all no = "+sum);



        // sum of square of all odd and even no in list
        Integer even = marks.stream().filter(a -> a % 2 == 0).mapToInt(n -> n*n).reduce(Integer::sum).getAsInt();
        System.out.println("even no square sum = "+even);

        // odd
        Integer odd = marks.stream().filter(a -> a%2 !=0).mapToInt(a ->a*a).reduce(Integer::sum).getAsInt();
        System.out.println("odd no square sum  = "+odd);


        // remove duplicates froom list
        List<Integer> removeDuplicates = marks.stream().distinct().collect(Collectors.toList());
        System.out.println(removeDuplicates);

        // sort the list

        // find the multiples of 5 from the list
        List<Integer> multiplesOfFive = marks.stream().filter((a -> a % 5 == 0)).collect(Collectors.toList());
        System.out.println(multiplesOfFive);

        // find max and min element from list
        int min = marks.stream().min((a, b) -> a.compareTo(b)).get();
        System.out.println("min marks = " + min);
        int max = marks.stream().max((a, b) -> a.compareTo(b)).get();
        System.out.println("max marks =" + max);
*/

        // sum of all in given list(marks)
        int resultSum = marks.stream().reduce(0,(a,b) -> a+b);
        System.out.println("sum  = "+resultSum);
        Iterator<Integer> itr = marks.iterator();
        int result =0;
        while(itr.hasNext()){
            result = result+itr.next();
        }
        System.out.println(result);

        Double avg = marks.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();
        System.out.println("average = "+avg);
    }
}
