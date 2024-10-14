package generics;

class Dummy<T extends Number>{

    // Number and its child classes are allowed

}
public class BoundGen {
    public static void main(String[] args) {

        // Number or child of it are allowed
        Dummy<Integer> i = new Dummy<>();
        Dummy<Float> f = new Dummy<>();

    }
}
