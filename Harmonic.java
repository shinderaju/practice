package practice;
import java.util.*;
public class Harmonic{
         public static void main(String []args){
              int n=0;
              Scanner sc = new Scanner(System.in);
              do{
                 System.out.println("Enter the number");
                 n=sc.nextInt();
              }while(n<=0);
              Utility u = new Utility();
              float sum=u.harmonicValue(n);
              System.out.println("Harmonic value of "+n+" is "+sum);
          }
}
