package practice;
import java.util.*;
public class StopWatch{
     public static void main(String[] args){
                  int str,stp;
                  long start=0;
                  Scanner sc = new Scanner(System.in);
                  Utility u = new Utility();
                  
                  System.out.println("If you want to start watch,press 1");
                  str=sc.nextInt();
                  if(str==1)
                      start=u.startStopWatch();
                  System.out.println("If you want to stop, press 2 ");
                  stp=sc.nextInt();
                  if(stp==2)
                     u.elapsde(start);
   }
}            





            
