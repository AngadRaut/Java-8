package FuctionalInterfacePractice.Practice;

public class Q9 {
    public static void main(String[] args) {
        int no = 11 ;
        int rem = 0 ;
        for(int i =1;i<=no;i++){
            if(no%i==0){
                rem = rem+1;
            }
        }
        if(rem==2){
            System.out.println("is prime");
        }else System.out.println("not prime");
    }
}
