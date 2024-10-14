package method_constructor_reference;


interface Abc{
    public void first();
//    public void first(int a);
//    public void third();
}
public class Lambda {
    public static void main(String[] args) {
        Abc a = () -> System.out.println("add");
    }
}
