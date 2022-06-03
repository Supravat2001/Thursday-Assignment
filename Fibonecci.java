package BasicPrograms;

import java.util.Scanner;

public class Fibonecci {
		public static void fib(int x) // method to print fibonecci series
		{
		int i,n1=1,n2=0,n3=0; // Declaring variables
		for(i=0;i<=x; i++) {
		System.out.println(n3);//printing output
		n3=n1+n2;
		n1=n2;
		n2=n3;

		}
		}

		public static void main(String[] args) {

		   int v;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit upto you want to see fibonecci number");
		v=sc.nextInt();// taking input from users end
		fib(v); // Invoking method
		}
		}


