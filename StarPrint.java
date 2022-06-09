package OOps;

import java.util.Scanner;

public class StarPrint {
	public static void main (String[]args)
	{
	// Declaring variables
	int n,row,col;
	System.out.println("Enter limit you want to print pattern");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt(); //taking limit upto pattern will print
	//printing rows
	for(row=1;row<=n;row++) 
	{
		//printing space
		for (col=1;col<=n-row;col++) 
		{
			System.out.print(" ");
		}
		//printing star
		for (col=1;col<=2*row-1;col++) 
		{
			System.out.print("*");
		}
		//new line for next row
		System.out.println(" "); 
	}

	}
}
