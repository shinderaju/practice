    package practice;
import java.util.*;
import java.lang.*;
public class Power{
     public static void main(String []args){
             int n=0;
             Scanner sc= new Scanner(System.in);
             do{
             System.out.println("enter valid number(0-31)");
             n=sc.nextInt();
             }while(n>30);
             Utility u = new Utility();
             u.printPower(n);
      }

      
}
