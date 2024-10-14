package generics;

class TestGen<T>{
    T obj ;
    TestGen(T obj){
        this.obj=obj;
    }
    public void dummy(){
        System.out.println("gen type = "+obj.getClass().getName());
    }
    public T getObj(){
        return obj;
    }
}
public class GenClass {
    public static void main(String[] args) {
        TestGen<String> t  = new TestGen<>("java");
        t.dummy();

        System.out.println(t.obj);

        TestGen<Integer> t2  = new TestGen<>(32300);
        t2.dummy();

        System.out.println(t2.obj);
    }
}
