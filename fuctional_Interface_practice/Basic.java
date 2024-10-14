package fuctional_Interface_practice;

interface Interface{
    public   void dummy();
}

public class Basic implements  Interface{


    public static void main(String[] args) {


    }

    @Override
    public void dummy() {
        System.out.println("dummy");
    }
}
