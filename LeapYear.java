package practice;
import java.util.*;
public class LeapYear
{
  public static void main(String []args){
          int year=0;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the year");
          year=sc.nextInt();
          Utility u = new Utility();
          if(u.checkLeap(year))
                System.out.println("Year "+year+" is leap year");
          else
               System.out.println("Year "+year+" is not leap year");
  }
 
 
}
