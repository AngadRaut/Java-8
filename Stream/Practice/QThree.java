package FuctionalInterfacePractice.Practice;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.List;

// . Write a Java program to implement a lambda expression to convert a list of
//   strings to uppercase and lowercase.
public class QThree {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("progRamming");
        list.add("is");
        list.add("best");
        list.add("LAnguage");
        list.add("iN");
        list.add("All");
        list.add("Other");
        list.add("FOr");
        list.add("DEVEloping");
        System.out.println(list);
        List<String> l = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println("upper case list = "+l);
        List<String> l2 = list.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
        System.out.println("lower case list = "+l2);

    }
}
