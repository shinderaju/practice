package practice;
import java.util.*;
public class HaidTail{
    public static void main(String []args){
          int n=0;
          Scanner sc = new Scanner(System.in);
        
          do{
                      System.out.println("enter number of flip");
                      n = sc.nextInt();
           }while(n<=0);
       
          Utility u = new Utility();
          u.countHT(n);
    }
}
