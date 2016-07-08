package practice;
import java.util.*;
public class Triple
{
 public static void main(String []args)
{
   int n;
   System.out.println("how many number you want to enter");
   Scanner sc= new Scanner(System.in);
   n=sc.nextInt();
   int[] list=new int[n];
   System.out.println("enter"+n+" array elements");
   for(int i=0;i<n;i++)
        list[i]=sc.nextInt();
   Utility u = new Utility();
   u.findTriple(list,n);
}
}
