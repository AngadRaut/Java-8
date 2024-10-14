package FuctionalInterfacePractice.Practice;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.List;
import java.util.stream.Collectors;


/*  Write a Java program to implement a lambda expression to filter out even and
    odd numbers from a list of integers */
  public class QuestionFour {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(15);
        list.add(12);
        list.add(22);
        list.add(35);
        list.add(38);
        list.add(90);
        list.add(78);
        System.out.println(list);
        List<Integer> listEven =  list.stream().filter(a -> a%2 == 0 ).collect(Collectors.toList());
        System.out.println("even elements = "+listEven);
        List<Integer> listOdd =  list.stream().filter(a -> a%2 != 0 ).collect(Collectors.toList());
        System.out.println("even elements = "+listOdd);
/*
        // find even numbers
        Predicate<Integer> i = a -> a % 2 == 0 ;
        Predicate<Integer> i2 = a -> a % 2 != 0 ;
        System.out.println("even no : ");
        for(Integer integer :list){
            if(i.test(integer)){
                System.out.print(integer+",");
            }
        }
        //find odd numbers
        System.out.println("\nodd no : ");
        for(Integer integer :list){
            if(i2.test(integer)){
                System.out.print(integer+",");
            }
        }*/
    }
}
