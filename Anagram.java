package practice;
import java.util.*;
public class Anagram
{
    
public static void main(String []args)
{
    String str1,str2;
    System.out.println("enter the two strings");
    Scanner sc= new Scanner(System.in);
    str1 = sc.next();
    str2 = sc.next();
    Utility u = new Utility();
    if(u.checkAnagram(str1,str2))
      System.out.println("strings are anagram");
    else
      System.out.println("strings are not anagram");
}

}


