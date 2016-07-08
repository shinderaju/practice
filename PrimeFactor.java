package practice;
import java.util.*;
public class PrimeFactor {

public static void main(String []args)
{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        long n = sc.nextLong();
        Utility u = new Utility();
        u.findPrimeFactor(n);
 }
}
