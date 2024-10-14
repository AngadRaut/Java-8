package method_constructor_reference;
import java.util.function.Supplier;
import java.util.function.Function;

public class Student {
   /* String name;
    public Student (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }*/
    static {
       System.out.println("This is static method");
   }
    public static void main(String[] args) {
      /*  Student obj = new Student("Bharat");
        // using lambda expression
        Supplier<String> s1 = () -> obj.getName();
        System.out.println("using lambda expression = "+s1.get());

        // using method reference
        Supplier<String> s = obj :: getName;
        System.out.println("using method reference = "+s.get());

        // using constructor reference
        Function<String,String> f = (a) -> a.toUpperCase();
        Function<String,String> f2 = String :: toLowerCase;
//        System.out.println(f.apply();
        System.out.println(f.apply("java"));
        System.out.println(f.apply(obj.getName()));
        System.out.println(f2.apply(obj.getName()));*/

        // constructor reference
        Supplier<Object> s = Student :: new;
        System.out.println(s.get());


    }
}
