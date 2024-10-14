package fuctional_Interface_practice;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Employee{
    String name;
    double salary;
    Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public String toString(){
        return name+":"+salary;
    }
}
public class BiConsumerDemo {

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("nana",60000));
        list.add(new Employee("Ganesh",45000));
        list.add(new Employee("Mauli",30000));
        list.add(new Employee("Murli",100000));
        list.add(new Employee("Digvijay",70000));
        list.add(new Employee("Rohit",55000));
        list.add(new Employee("Kaka",35000));
        list.add(new Employee("jagtap",65000));
        System.out.println(list);
        BiConsumer<Employee,Double> biPredicate =(a,b)->a.salary=a.salary+b;
        for(Employee e :list){
//            System.out.println(e.name+":"+e.salary);
            biPredicate.accept(e,25000.00);
            System.out.println(e.name+":"+e.salary);
        }
    }
}
