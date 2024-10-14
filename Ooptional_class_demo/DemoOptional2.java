package fuctional_Interface_practice.Ooptional_class_demo;

import java.util.Optional;

public class DemoOptional2 {
    public static void main(String[] args) {
        // create an instance of optional class
//        String str = "java optional practice";
        String str = null;
        Optional<String> strOptional = Optional.ofNullable(str);
        if(strOptional.isPresent()) {
            String name = strOptional.get();
            System.out.println(name);
        }else {
            System.out.println("no name found");
        }

        // orElse()
        Optional<Integer> id = Optional.of(1001);
        Integer id1 = id.orElseGet(() -> 100);

    }
}
