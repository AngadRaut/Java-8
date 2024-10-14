package stream_practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Map;

public class CollectorsClassMethods {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("nana","java","programming","methods","function");

        // toMap() function
        Map<String,Integer> map = list.stream().collect(Collectors.toMap(a -> a,a->a.length()));
        Map<String,Integer> map2 = list.stream().collect(Collectors.toMap(Function.identity(),a->a.length()));
        System.out.println(map);

        //
    }
}
