package practice;
import java.util.Scanner;
public class Welcome
{ 
              public static void main(String []args){
    
                       String st="hello username,how are you?";
                       System.out.println("Enter user name");
                       Scanner sc = new Scanner(System.in);
                       String uname= sc.next();
                       Utility u = new Utility();
                       u.replace(st,uname);
              }
  


  
}


