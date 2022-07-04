package arrayexamples;

import java.util.Scanner;

public class MaximumandMinimumNo 
{
	
	public static void main(String[] args) 
	{
		int size,max=0,min,j;
		System.out.println("Enter the size of 1st Array");
		Scanner sc=new Scanner(System.in);
		//Receive size of the array
		size=sc.nextInt();
		int array[]=new int[size];

		System.out.println("Enter elements in the Array: ");
		
		//loop to insert elements in the array
		for(int i=0;i<size;i++) {
			
			array[i]=sc.nextInt();
		}
		min=array[0];
		//finding max. and min. number in array
		for(j=0;j<size;j++) {
			if(array[j]<min)//checking minimum number
			{
				min=array[j];
			}
				if(array[j]>max) //checking maximum number
				{
					max=array[j];
					
				}
			
			}
if(j==size) {
	System.out.println("maximum element in the array is: "+max+"\nAnd minimun element is: "+min);
}


	}

}
		
	


