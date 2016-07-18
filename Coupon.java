package practice;

import java.lang.*;
import java.util.*;

public class Coupon {
	public static void main(String[] args)
	{

		System.out.println("How many random nos. you want to generate?");
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();

		int count = 0;
		int rnd;
		Random rand = new Random();
		ArrayList numbers = new ArrayList();
		for (int k = 0; k < p; k++)
		{
			rnd = rand.nextInt(100);
			if (k == 0)
			{
				count++;
				numbers.add(rnd);
			}
			else 
			{
				count++;
				while (numbers.contains(new Integer(rnd))) 
				{
					count++;
					rnd = rand.nextInt(100);
				}
				numbers.add(rnd);
			}
		}

		System.out.println(numbers);
		System.out.println("Random no to generate distinct coupon " + count);
		Coupon c = new Coupon();
		// c.arrprint(numbers);

	}

}