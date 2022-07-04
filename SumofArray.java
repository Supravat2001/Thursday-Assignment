package arrayexamples;

import java.util.Scanner;

public class SumofArray 
{

	public static void main(String[] args) 
	{
		int size,sum=0;//declaring variables
		System.out.println("Enter the size of 1st Array");
		Scanner sc=new Scanner(System.in);
		//Receive size of the array
		size=sc.nextInt();
		int array[]=new int[size];

		System.out.println("Enter elements in the Array: ");
		
		//loop to insert Elements in the array
		for(int i=0;i<size;i++) {
			
			array[i]=sc.nextInt();
			//adding array element and assigning in sum
			sum=array[i]+sum;
		}
		System.out.println("Sum of the array elements is: "+sum);

	}

}


