package fuctional_Interface_practice;

abstract class A{
    public abstract void add();

    public void add2(int a,int b){
        System.out.println(a+b);
    }
}
interface B {
    void sub();
//    public abstract void dummy();
    default void sub(int a,int n){
        System.out.println(a-n);
    }
}
public class AnnonyLambdaExample {
    public static void main(String[] args) {

        // lambda expression for  interface
        B a = () -> System.out.println("lambda in abstract class");

        // for abstract class anonymous inner class
        A h = new A(){
            int b ;
            int a = 10 ;
            @Override
            public void add(){
                System.out.println("abstract class method using anonymous class"+a +" b = "+ b);
            }

        };
        h.add();
        h.add2(2,3);

        // anonymous inner class for interface B
        B b = new B(){
            @Override
            public void sub(){
                System.out.println("interface abstract method using anonymous class");
            }
        };
        b.sub(1,4);
        b.sub();
        AnnonyLambdaExample obj = new AnnonyLambdaExample();

    }
}
