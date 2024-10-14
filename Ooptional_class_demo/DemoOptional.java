package fuctional_Interface_practice.Ooptional_class_demo;


import java.util.Optional;

public class DemoOptional {
    public static void main(String[] args) {
        String [] str = new String[5];
        str[2] ="learn java programming";
        // empty() method -> returns an empty optional object
        Optional<Object> emptyObject = Optional.empty();
        System.out.println(emptyObject);
        System.out.println(emptyObject.hashCode());

       /* // of() -> it returns a non empty optional
        String email = null;

        Optional<String> emailOptional =  Optional.of(email);
        System.out.println(emailOptional);*/

        // ofNullable(T value) ->  instance of optional with specified value of the
         //                        specified type .If the specified value is null,
        //                         then this method returns an empty instance of the Optional class.
        Optional<String> ofNullableOptional = Optional.ofNullable("null");
        System.out.println(ofNullableOptional);

        // get() method returns the value present in optional instance
        // isPresent() -> returns boolean value whether there is  value present in this optional instance
        if(ofNullableOptional.isPresent()){
            System.out.println(ofNullableOptional.get());
        }else{
            System.out.println("no value present");
        }

        // orElse(T value) -> returns
        String email = null ;
        Optional<String> emailOptional = Optional.ofNullable("email.com");
        System.out.println(emailOptional.orElse(email));


        // ifPresent()
        Optional<String> male = Optional.of("AllboutJava");
        Optional<String> male2 = Optional.empty();

        if(male2.isPresent()){
            System.out.println(male2);
        }
        else{
            System.out.println("object not present");
        }
    }
}
