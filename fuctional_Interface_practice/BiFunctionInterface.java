package fuctional_Interface_practice;
import java.util.function.BiFunction;

public class BiFunctionInterface {
    public static void main(String[] args) {
        BiFunction<Double,Double,Double> obj = (a,b) -> a = a - (a*b/100);
       double discount =  obj.apply(1000.00,20.00);
        System.out.println(discount);
    }
}
