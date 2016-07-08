package practice;
import java.util.*;
public class BinarySearch
{

public static void main(String []args)
{
            Utility u = new Utility();
            System.out.println("how many words you want to save");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String[] words = new String[n];
            System.out.println("Enter the words");
           
            for(int i=0;i<n;i++)
            {
             words[i]=sc.next();
            }
            Arrays.sort(words);

            System.out.println("array after sorting");
            for(String s : words)
            {
              System.out.println(s);
            }

            System.out.println("enter the word you want to search");
            String value = sc.next();
            int val=u.bSearch(words,value);
            if(val!=-1)
               System.out.println("Word " + value + "found at position = " + val);
            else
               System.out.println("word "+value+" not found");

    }
}
