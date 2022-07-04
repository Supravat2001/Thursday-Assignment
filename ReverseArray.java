package arrayexamples;

import java.util.Scanner;

public class ReverseArray
{

	public static void main(String[] args) 
	{
		
			int j=4;
			int array[]=new int[5];
			int array2[]=new int[5];
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Elements To Reverse: ");
			for(int i=0;i<5;i++) {
				
				array[i]=sc.nextInt();
			}
			System.out.println("Reversed elements are: ");
	for(int i=0;i<array.length;i++) {
		
		array2[j]=array[i];
		j--;
		
	}
	for(int i=0;i<array2.length;i++) {
		
		System.out.println("element in index: "+i+" is:"+" "+array2[i]);
	}
		}
	

	}


