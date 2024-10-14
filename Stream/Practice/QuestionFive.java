package FuctionalInterfacePractice.Practice;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.List;

//  Write a Java program to implement a lambda expression to sort
//  a list of strings in alphabetical order.
public class QuestionFive {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("programming");
        list.add("inheritance");
        list.add("angular");
        list.add("buffer-reader");
        list.add("encapsulation");
        list.add("pythan");
        list.add("constructor");
        list.add("string");
        System.out.println("original list "+list);

        // using stream
        List<String> sortedList = list.stream().sorted((a,b) -> a.compareTo(b)).collect(Collectors.toList());
        System.out.println("sorted list = "+sortedList);

        // sort list by length
//        List<String> lengthSort = list.stream().sorted((a,b) -> a.length())
        list.sort((s1,s2) -> s1.compareTo(s2));
//        list.sort(Comparator.reverseOrder());
//        System.out.println("alphabetical order list = "+list);

        list.sort((s1,s2) -> (s1.length()>s2.length()) ? -1 : (s1.length()<s2.length() ? +1 : 0));
//        System.out.println("sort by length , list = "+list);
    }
}
