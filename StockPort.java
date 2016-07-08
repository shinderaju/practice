package practice;

import java.util.Scanner;
class StockPort
{
	String name;
	int share,price,totalValue;
	StockPort()
	{
		Scanner scan=new Scanner(System.in);
		//getting stock name
		System.out.print("Stock Name : ");
		name=scan.next();
		//getting number of shares
		System.out.print("No of Shares : ");
		share=scan.nextInt();
		//getting share price
		System.out.print("Share price : ");
		price=scan.nextInt();
		totalValue=share*price;	
	}
	public void stockReport()
	{
	System.out.println(name+"\t"+share+"\t"+price+"\t"+totalValue);
	}
}
