package practice;
import java.util.*;
public class BubbleSort
{
public static void main(String []args)
{
            
            System.out.println("how many element you want to enter");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] words = new int[n];
            System.out.println("Enter the elements");
           
            for(int i=0;i<n;i++)
            {
             words[i]=sc.nextInt();
            }
            Utility u = new Utility();
            u.BubbleSort(words,n);
            System.out.println("array after sorting");
            for(int s : words)
            {
              System.out.println(s);
            }
}
}
