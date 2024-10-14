package stream_practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.List;

public class Students {
    String name;
    int id ;
    String subject ;
    double percentage;
    Students(String name,int id,String subject,double percentage){
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.percentage = percentage;
    }
    public String getName(){
        return name;
    }
    public String getSubject(){
        return subject;
    }
    public int getId(){
        return id;
    }
    public double getPercentage(){
        return percentage;
    }
    public String toString(){
        return "{ "+"Name:"+name+",Id:"+id+",Sub:"+subject+",Percentage = "+percentage+" }\n";
    }
    public static void main(String[] args) {
//        List<Students> list = Arrays.asList(new Students("ananta",44,"eco",88.00));
        List<Students> studentList = new ArrayList<>();

        studentList.add(new Students("Paul", 11, "Economics", 78.9));
        studentList.add(new Students("Zevin", 12, "Computer Science", 91.2));
        studentList.add(new Students("Harish", 13, "History", 83.7));
        studentList.add(new Students("Xiano", 14, "Literature", 71.5));
        studentList.add(new Students("Soumya", 15, "Economics", 77.5));
        studentList.add(new Students("Asif", 16, "Mathematics", 89.4));
        studentList.add(new Students("Nihira", 17, "Computer Science", 84.6));
        studentList.add(new Students("Mitshu", 18, "History", 73.5));
        studentList.add(new Students("Vijay", 19, "Mathematics", 92.8));
        studentList.add(new Students("Harry", 20, "History", 71.9));

        studentList.add(new Students("A", 21, "Economics", 35.5));
        studentList.add(new Students("B", 22, "Mathematics", 36.4));
        studentList.add(new Students("C", 23, "Computer Science", 34.6));
        studentList.add(new Students("D", 24, "History", 33.5));
        studentList.add(new Students("E", 25, "Mathematics", 39.8));

        // list of students
//        System.out.println("original list = "+studentList);

        // add 7% marks who have below 40% and different them from others
//      List<Students> j = studentList.stream().filter(a-> a.getPercentage() < 40.00).map(a -> a.getPercentage()+7.00).toList();



/*        // grouping students by grade
        Map<String,Map<Integer, String>> g = studentList.stream().collect(Collectors
                .groupingBy(Students::getSubject,Collectors.toMap(Students::getId, Students::getName)));
        System.out.println(g);


        // grouping students by subjects
        Map<String,List<Students>> mg = studentList.stream().collect(Collectors.groupingBy(Students::getSubject));
        System.out.println(mg);

        // partitioning by subject
        Map<Boolean,List<Students>> l = studentList.stream().collect(Collectors.partitioningBy(a -> a.getSubject().equals("Economics")));
        System.out.println(l);


        // partitioning students by first class grades
        Map<Boolean,List<Students>> firstClassPartition = studentList.stream().collect(Collectors.partitioningBy(a -> a.getPercentage()>80.00));
        System.out.println("partition based on first class students i.e percentage > 80.00\n"+firstClassPartition);


        // partitioningBy() method  => partition stream into two streams based on a given predicate
        Map<Boolean,List<Students>> mp = studentList.stream().collect(Collectors.partitioningBy(a -> a.getId()%2==0));
        System.out.println("partition based on even and odd Id's\n"+mp);


        // counting sum of percentage
        Double percentage_sum = studentList.stream().mapToDouble(Students::getPercentage).sum();
        System.out.println("sum of percentage is = "+percentage_sum);
        Double summingDouble = studentList.stream().collect(Collectors.summingDouble(Students::getPercentage));
        System.out.println("using collectors summingDouble method "+summingDouble);

        // find average of percentage
        Double avg = studentList.stream().mapToDouble(Students::getPercentage).average().getAsDouble();
        Double averagingDouble = studentList.stream().collect(Collectors.averagingDouble(Students::getPercentage));
        System.out.println("average is = "+avg);
        System.out.println("using collectors class averaging method = "+averagingDouble);

        // find distinct objects
        List<String> obj = studentList.stream().map(a -> a.getSubject()).distinct().toList();
        System.out.println(obj);


        // count subjects from students list and no of students taken  that subject
        Map<String,Long> m = studentList.stream().collect(Collectors.groupingBy(Students::getSubject,Collectors.counting()));
        System.out.println(m);



        // Collecting top 3 performing students into List
//        List<Students> top3 = studentList.stream().collect(Collectors.groupingByConcurrent((a,b) -> a.getPercentage()-b.getPercentage()).collect(Collectors.toUnmodifiableList());

        //  Collecting subjects offered into Set.
//        Set<Students> s1 = new HashSet<>(studentList);
        Set<Students> s1 = studentList.stream().collect(Collectors.toSet());
        System.out.println("set hashset = "+s1);
        Set<String> s = studentList.stream().map(Students :: getSubject).collect(Collectors.toSet());
        // or Set<String> s = studentList.stream().map(a -> a.getSubject()).collect(Collectors.toSet());
        System.out.println(s);

        // Collecting name and percentage of each student into a Map
        Map<String,Double> map = studentList.stream().collect(Collectors.toMap(Students::getName,Students::getPercentage));
        System.out.println(map);





        // Collecting the names of all students joined as a string
        String joinedNames = studentList.stream().map(Students::getName).collect(Collectors.joining(","));
        System.out.println(joinedNames);
        // collecting the subjects of all students joined as a string
        String joinedSubjects = studentList.stream().map(Students::getSubject).distinct().collect(Collectors.joining(","));
        System.out.println(joinedSubjects);

        // counting the no of students
        Long count_students = studentList.stream().count();
        System.out.println("no of students = "+count_students);


        //calculating highest percentage
        Double high_percentage = studentList.stream().map(Students::getPercentage).
                max(Double::compareTo).get();
       Optional <Students> max   = studentList.stream().max(Comparator.comparingDouble(Students::getPercentage));
        System.out.println(high_percentage);

        // min percentage find
        Double min = studentList.stream().map(Students::getPercentage).min( Comparator.naturalOrder()).get();
        System.out.println(min);
       // 2nd min percentage from list of students
//        List<Students> second_min = studentList.stream().map(a -> a.getPercentage()).
//                sorted((a,b) -> a.getPercentage().compareTo(b.getPercentage())).
//                collect(Collectors.toUnmodifiableList());



        // sort the list by percentage increasing order
        List<Double> l = studentList.stream().map(Students::getPercentage).sorted(Comparator.naturalOrder()).toList();
        System.out.println(l);


*/
    }
}
