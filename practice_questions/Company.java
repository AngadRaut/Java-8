package fuctional_Interface_practice.practice_questions;

import java.util.Map;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Company {
    public String getGender() {
        return gender;
    }

    String name ;
    int age ;
    String gender ;
    double salary ;
    int joiningYear ;
    String department ;

    // defining an parameterized constructor which contains all above fields
    Company(String name, int age, double salary, int joiningYear, String department, String gender){
        this.name = name ;
        this.age = age ;
        this.salary = salary ;
        this.joiningYear = joiningYear ;
        this.department = department ;
        this.gender = gender ;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    public String getDepartment() {
        return department;
    }
    public String toString(){
        return "{ "+"Name : "+getName()+",Age : "+getAge()+",Gender : "+getGender()+",Salary : "+getSalary()+",Department : "+getDepartment() +
                ",Joining Year : "+getJoiningYear()+" }\n";
    }
    public static void main(String[] args) {
        ArrayList<Company> list = new ArrayList<>();
        list.add(new Company("Sanjay",24,60000.00,2018,"Marketing","Male"));
        list.add(new Company("Manoj",22,80000.00,2020,"Product","Female"));
        list.add(new Company("Arvind",27,75000.00,2016,"Sales","Female"));
        list.add(new Company("Balaji",24,90000.00,2016,"Marketing","Female"));
        list.add(new Company("Mohini",24,60000.00,2020,"Product","Male"));
        list.add(new Company("Raju",24,75000.00,2016,"Sales","Male"));
        list.add(new Company("Siddhant",24,55000.00,2020,"Marketing","Male"));
        list.add(new Company("Narayan",24,80000.00,2018,"Product","Female"));
        list.add(new Company("Nisha",24,75000.00,2018,"Marketing","Male"));
        list.add(new Company("Godavari",24,60000.00,2020,"Sales","Female"));
        list.add(new Company("Bhushan",24,60000.00,2016,"Product","Female"));
        list.add(new Company("Kalpana",24,80000.00,2020,"Sales","Male"));
        list.add(new Company("Vikas",24,75000.00,2018,"Product","Female"));
        list.add(new Company("Datta",24,95000.00,2020,"Sales","Female"));
        list.add(new Company("Waman",24,60000.00,2018,"Product","Male"));
        list.add(new Company("Pooja",24,80000.00,2020,"Sales","Female"));
        list.add(new Company("Sanjay",24,60000.00,2016,"Product","Female"));
        list.add(new Company("Sanjay",24,60000.00,2020,"Sales","Male"));
        list.add(new Company("Pooja",24,80000.00,2016,"Product","Male"));

        // print the list
        System.out.println(list);
        // how many employees are there in organization
        Long count = list.stream().count();
        System.out.println("Count of Total employees = "+count);

        // count the no of male and female employees
        Long male_emp = list.stream().filter(a -> a.getGender().equals("Male")).count();
        System.out.println("male emp = "+male_emp);
        Long female_emp = list.stream().filter(a -> a.getGender().equals("Female")).count();
        System.out.println("female emp = "+female_emp);
        // using map

//        Map<Object,Long> no = list.stream().collect(Collectors.groupingBy(a->a.getGender()),Collectors.counting());
        Map<Object, Long> no = list.stream()
                .collect(Collectors.groupingBy(a -> a.getGender(), Collectors.counting()));

    }
}
