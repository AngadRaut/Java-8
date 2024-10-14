package FuctionalInterfacePractice.Practice;
import java.util.function.Predicate;
// Write a Java program to implement a lambda expression to check if a given string is empty.

public class QTwo {
    public static void main(String[] args) {
        Predicate<String> isEmpty = str -> str.isEmpty();
        String str1 = "java programming";
        String str2 = "";
        System.out.println(isEmpty.test(str1));
        System.out.println(isEmpty.test(str2));
    }
}
