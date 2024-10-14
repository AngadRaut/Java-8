package stream_practice.streammap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prime {
    public void isPrime(Integer no){
        int count = 0;
        for(int i = 1; i <= no ;i++){
            if(no % i ==0 ){
                count++;
            }
        }
        if(count > 2 ){
            System.out.println(" Not Prime");
        }
        else System.out.println("Prime");
    }
    public static void main(String[] args) {
        Prime obj = new Prime();
        obj.isPrime(57);

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
        List<Integer> intersection = list1.stream()
                .filter(list2 :: contains)
                .collect(Collectors.toList());
        System.out.println(intersection);

        // unique elements list
        List<Integer> unique = Stream.concat(list1.stream(),list2.stream()).distinct().sorted().collect(Collectors.toUnmodifiableList());
        System.out.println(unique);

    }


}
