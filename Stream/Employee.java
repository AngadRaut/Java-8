package stream_practice;
import java.util.ArrayList;

public class Employee {
    int id ;
    String name;
    int age;
    String department;
    String gender;
    int yearOfJoining ;
    double salary ;
    Employee (int id,String name,int age,String gender,String department,int yearOfJoining,double salary){
        this.id =id;
        this.name=name;
        this.age =age;
        this.gender=gender;
        this.department =department;
        this.yearOfJoining =yearOfJoining;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }
    public String getGender(){
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "{ Name:"+name+",id:"+id+",age:"+age+",Gender:"+gender+",Dep:"+department+",Joining Date:"+
                yearOfJoining+",Salary:"+salary+" }\n";
    }

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(101,"Sanjay",26,"female","Hr",2017,60000.00));
        list.add(new Employee(102,"Vaibhav",23,"male","Team Lead",1015,55000.00));
        list.add(new Employee(103,"Sanjay",26,"male","Team Lead",2015,55000.00));
        list.add(new Employee(104,"Manoj",29,"female","Hr",2013,60000.00));
        list.add(new Employee(105,"Mohan",22,"female","Developer",2017,45000.00));
        list.add(new Employee(106,"Rawat",23,"male","Developer",2015,35000.00));
        list.add(new Employee(107,"Ajit",23,"male","Tester",2015,45000.00));
        list.add(new Employee(108,"Sagar",30,"female","Backend Developer",2013,60000.00));
        list.add(new Employee(109,"Satyam",46,"female","Front End Developer",2013,100000.00));
//        System.out.println(list);
        // list out the name of employees in each department
        // what is total and average salary of organization
//        Double total_salary = list.stream().mapToDouble(a -> a.getSalary()).reduce(i -> i).getAsDouble();

// who is the oldest employee and its details
//        List<Employee> list1 = list.stream().max((a,b) -> a.getYearOfJoining().compareTo(b.getYearOfJoining())).collect(Collectors.toList());




        // average salary of male and female emp
        // female
       /* Double avgFemale_salary = list.stream().filter(a -> a.getGender().equals("female"))
                .mapToDouble(a -> a.getSalary()).average().getAsDouble();
        System.out.println("Average Female Salary is = "+avgFemale_salary);*/

        // mele
       /* Double avgMale_salary= list.stream().filter(a -> a.getGender().equals("male")).mapToDouble(a -> a.getSalary()).average().getAsDouble();
        System.out.println("average male salary = "+avgMale_salary);*/

        // who is the most experienced person in the organization
//        List<Employee> name = list.stream().max((a,b) -> a.getYearOfJoining().compareTo(b.getYearOfJoining())).stream().collect(Collectors.toList());
        // calculate average salary of each department
       /* Map<String , Double > avgSalary_department = list.stream().collect(Collectors.groupingBy(a -> a.getDepartment(),Collectors.averagingDouble(a -> a.getSalary())));
        System.out.println(avgSalary_department);*/

        /*//get the information of highest paid employee in organization
       List<Employee> highSalaryEmp = list.stream().max((a,b) -> a.getSalary().compareTo(b.getSalary()).collect(Collectors.toList());  */

        // find the no of employee joined in particular year
       /* Map<Integer,Long> emp_year = list.stream().collect(Collectors.groupingBy(a -> a.yearOfJoining,Collectors.counting()));
        System.out.println("no of employees and year = \n"+emp_year);*/


        // count the no of employees in each department
        /*Map<String,Long> empInDept = list.stream().collect(Collectors.groupingBy(a -> a.getDepartment(),Collectors.counting()));
        System.out.println("No of employees in each department is = \n"+empInDept);*/

        // list of employees who joined after year 2015
/*//       List<Employee> after_15 = list.stream().filter(a -> a.yearOfJoining>2015).collect(Collectors.toUnmodifiableList());
//       List <Employee> after_15 = list.stream().filter(a -> a.getYearOfJoining()>2015).toList();
        List <Employee> after_15 = list.stream().filter(a -> a.getYearOfJoining()>2015).collect(Collectors.toList());
        System.out.println("Employees joined after 2015 = \n"+after_15);*/

        // total average age
      /*  Double totalAvg_age = list.stream().mapToDouble(a -> a.getAge()).average().getAsDouble();
        System.out.println("total average age = "+totalAvg_age);*/

        // find the average age of male and female employees
        // male average age
        /*Double avgAge_male = list.stream().filter(a->a.getGender().equals("male")).mapToDouble(a -> a.getAge() ).average().getAsDouble();
        System.out.println("male average age = "+avgAge_male);

        // female average age
        Double avgAge_female = list.stream().filter(a -> a.getGender().equals("female")).mapToDouble(a -> a.getAge()).average().getAsDouble();
        System.out.println("female average age = "+avgAge_female);*/



       /* // print name of all departments in organization
        List<String> department = list.stream().map(a -> a.getDepartment()).distinct().collect(Collectors.toList());
        System.out.println(department);*/


        // How many male and female employees in company
       /* // 1. by using simple filter function in stream
        Long no_male = list.stream().filter(a -> a.getGender().equals("male")).count();
        Long no_female = list.stream().filter(a -> a.getGender().equals("female")).count();
        System.out.println("Female = "+no_female+"\nMale = "+no_male);

        Map<String,Long> no = list.stream().collect(Collectors.groupingBy(a -> a.getGender(),Collectors.counting()));
        System.out.println(no);*/



        // convert the list to map where Keys -> id and values -> Employee object
       /* Map<Integer,Employee> map = list.stream().collect(Collectors.toMap(a->a.getId(),Employee -> Employee));
        System.out.println("Map where keys = id and values = Employees objects / details = \n"+map);*/


    }
}
