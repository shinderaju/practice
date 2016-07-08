package practice;
import java.util.*;
public class GamblerGame { 

    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the stake gamlor have initially");
        int stake  = sc.nextInt();
        System.out.println("enter the goal you want  to acheive");
        int goal   = sc.nextInt();
        System.out.println("how many time you want to play");
        int n = sc.nextInt();
        Utility u = new Utility(); 
        u.gambler(stake,goal,n);
    }
}
