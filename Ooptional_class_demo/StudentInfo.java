package fuctional_Interface_practice.Ooptional_class_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.function.Consumer;
import java.util.function.Function;

public class StudentInfo {
    String name;
    int id;
    String specialization;
    double salary;

    StudentInfo(String name, int id, String specialization, double salary) {
        this.name = name;
        this.id = id;
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "{ " + getName() + ":" + id + "," + salary + "," + specialization + " }";
    }

    public static void main(String[] args) {

        // creating an objects of student class
        StudentInfo obj = new StudentInfo("Ganesh", 101, "IT Engineer", 34000);
        StudentInfo obj1 = new StudentInfo("Mahesh", 190, "Mechanical Engineer", 80000);
        StudentInfo obj2 = new StudentInfo("Rajesh", 167, "Doctor", 25000);
        StudentInfo obj3 = new StudentInfo("Santosh", 111, "IT Engineer", 38000);
        StudentInfo obj4 = new StudentInfo("Kalpana", 121, "Doctor", 100000);
        StudentInfo obj5 = new StudentInfo("Vishnu", 124, " Mechanical Engineer", 12000);
        StudentInfo obj6 = new StudentInfo("Anna", 104, "IT Engineer", 67900);
        StudentInfo obj7 = new StudentInfo("Bhavesh", 111, "Doctor", 150000);
        StudentInfo obj8 = new StudentInfo("Akshay", 119, " Mechanical Engineer", 200000);
        StudentInfo obj9 = new StudentInfo("Suresh", 109, " Mechanical Engineer", 50000);

        // creating  list and add all objects of studentInfo class in it
        ArrayList<StudentInfo> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj7);
        list.add(obj4);
        list.add(obj9);
        list.add(obj);
        list.add(obj6);
        list.add(obj3);
        list.add(obj2);
        list.add(obj5);
        list.add(obj8);
        System.out.println(list);

        // USING PREDICATE INTERFACE
        // using stream separate doctor list
        List<StudentInfo> drList = list.stream().filter(a -> a.getSpecialization().equals("Doctor")).collect(Collectors.toList());
        System.out.println("Doctors list = \n" + drList);

        // separate list of salary less than 50000
        List<StudentInfo> salaryBelow50K = list.stream().filter(a -> (a.getSalary()) < 50000).collect(Collectors.toList());
        System.out.println("Peoples whose salary less than 50k are = \n" + salaryBelow50K);

        // TESTING Consume INTERFACE
        Consumer<StudentInfo> print = (StudentInfo) -> {
            System.out.println(StudentInfo.getName() + ":" + StudentInfo.getSalary());
        };
        for (StudentInfo student : list) {
            print.accept(student);
        }

        // FUNCTION INTERFACE
   /*     Function<StudentInfo, String> f = new Function<StudentInfo, String>() {
            @Override
            public String apply(StudentInfo o) {
                return "java";
            }
        };
        f.apply(obj);*/

        Function<StudentInfo, String> function2 = (StudentInfo obj22) -> {
            return obj2.name;
        };
        function2.apply(obj);

        // SUPPLY
        Supplier<StudentInfo> s = new Supplier<StudentInfo>() {
            @Override
            public StudentInfo get() {
                return obj1;
            }
        };
//        s.get();
        System.out.println(s.get());

        Supplier<StudentInfo> s1 = () -> new StudentInfo("newadd",199,"newspecialization",50000);
        s1.get();
    }
}
