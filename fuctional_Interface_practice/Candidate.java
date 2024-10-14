package fuctional_Interface_practice;
import java.lang.Comparable;


public class Candidate implements Comparable{
    public int id;
    public int year;
    public String name;
    public String college;

    public int setId(int id){
        return 0;
    }

    @Override
    public int compareTo(Object c){
        return this.compareTo(c);
    }

    public static void main(String[] args) {

    }
}
