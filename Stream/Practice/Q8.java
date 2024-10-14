package FuctionalInterfacePractice.Practice;

// . Write a lambda expression to implement a lambda expression to calculate the
//   factorial of a given number.

public class Q8 {
   static int no = 9 ;
   static int fact=1;
    public static void main(String[] args) {
        for(int i = 1 ; i <= no ; i++){
            fact = i *  fact ;
        }
        System.out.println(fact);
    }
}