package FuctionalInterfacePractice.Practice;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Write a Java program to implement a lambda expression to find the average of
// a list of doubles.

public class QSix {
    public static void main(String[] args) {
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(46.5);
        doubleList.add(23.57);
        doubleList.add(46.5);
        doubleList.add(23.57);
        doubleList.add(46.5);
        doubleList.add(23.57);
        doubleList.add(46.5);
        doubleList.add(23.57);
        doubleList.add(46.5);
        doubleList.add(23.57);
        doubleList.add(46.5);
        doubleList.add(23.57);
        System.out.println(doubleList);
        double avg = doubleList.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
        System.out.println(avg);
    }
}
