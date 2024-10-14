package stream_practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListToMap {
    String name;
    int id;
    double salary;
    ListToMap(String name,int id,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public String toString(){
        return "{ " +
                ""+"Name:"+name+"," +
                " id:"+id+",salary:" +
                ""+salary+" " +
                "}\n";
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public static void isPrime(){

    }

    public static void main(String[] args) {
        // creating array
        ListToMap[] ar = {
                new ListToMap("Bharati",1001,45000),
                new ListToMap("Kalpana",1002,35000),
                new ListToMap("Madhuri",1003,25000),
                new ListToMap("Anuja",1004,45000),
                new ListToMap("Ganga",1005,35000),
                new ListToMap("Harshada",1006,25000),
                new ListToMap("Ravina",1007,45000),
                new ListToMap("Jyoti",1008,35000),
                new ListToMap("Sanika",1009,25000),
                new ListToMap("Lora",1010,45000),
                new ListToMap("Kajol",1012,35000),
                new ListToMap("Madhuri",1013,25000),
        };
        System.out.println("Array = "+Arrays.toString(ar));
        // convert array to list
        List<ListToMap> arrayToList = Arrays.asList(ar);
        System.out.println("arrayToList = "+arrayToList );

        // use forEach method on list
         arrayToList.stream().filter(a->a.getSalary()>40000).forEach(System.out::println);



        List<ListToMap> list = new ArrayList<>();
        list.add(new ListToMap("Shiwa bharati",101,100000));
        list.add(new ListToMap("Madhavi Raut ",102,125000));
        list.add(new ListToMap("Kalyani mule",103,50000));
        list.add(new ListToMap("Vikas mama",104,100000));
        list.add(new ListToMap("Ajay",105,80000));
        list.add(new ListToMap("Bhavesh Dharmadhikari",106,70000));
        list.add(new ListToMap("Hrutvik",107,85000));
        list.add(new ListToMap("Kundan",108,55000));
        list.add(new ListToMap("Ram",109,150000));

       // concat two lists
        List<ListToMap> concated_list = Stream.concat(list.stream(),arrayToList.stream()).distinct().collect(Collectors.toList());

   /*     // check prime no or not

        // average of salary
        Double avg = list.stream().mapToDouble(a -> a.getSalary()).average().getAsDouble();
        System.out.println(avg);




        System.out.println(list);
//        List<ListToMap> max_length = list.stream().max((a,b) -> a.getName().length().compareTo(b.getName().length())).collect(Collectors.toList());
//        System.out.println(max_length);



        // list to Map where key=id and value=objects
        Map<Integer,ListToMap> map = list.stream().collect(Collectors.toMap(a -> a.getId(),ListToMap -> ListToMap));
        System.out.println(map);*/










       /* // convert list to map id = key and  name = value
        Map<Integer,String> map = list.stream().collect(Collectors.toMap(a -> a.getId(),a->a.getName()));
        System.out.println(map);*/

//         convert list to map where key = id and value = all data of student
//        Map<Integer, Object> map2 = list.stream().collect(Collectors.toMap(a -> a.getId(),a -> a.);

       /* // sort list as per salary
        Comparator<ListToMap> sort = (a, b) -> a.getSalary() > b.getSalary() ? 1 : a.getSalary() < b.getSalary() ? -1 : 0;
        Collections.sort(list,sort);
        System.out.println(list);*/
    }
}
