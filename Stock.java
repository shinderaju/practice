package practice;

import java.util.Scanner;
public class Stock
{
public static void main(String[] args)
{
	int n,i;
	Scanner sc=new Scanner(System.in);
	//getting no of stocks
	System.out.println("Enter no of stocks:");
	n=sc.nextInt();
	StockPort sp[]=new StockPort[n];

	for(i=0;i<n;i++)
	{
			System.out.println("Enter "+(i+1)+"th Stock details:");
			sp[i]=new StockPort();
	}
	System.out.println("Stock Report:");
	System.out.println("name\tshare\tprice\ttotalValue");
	for(i=0;i<n;i++)
	{

			sp[i].stockReport();
	}
}
}
