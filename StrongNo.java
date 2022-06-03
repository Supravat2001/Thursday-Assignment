package BasicPrograms;

import java.util.Scanner;

/**
 * @author SUPRAVAT
 *
 */
public class StrongNo {
	public static int facto(int d , int fact) {   // Creating method to calculate factorial 
		int y; 
for(y=1;y<=d;y++) {		
			
			fact=fact*y;  //Calculatig factorial and assigning to fact		
		}
	return fact; //returning fact
	}
	
	public static void strong(int n) { //creating method to check entered number is strong or not 
		
		int y,fact=1,sum=0,d; //declearing variables
		int temp=n; //creating variables and assigning number into it 
		while (n!=0) { //to check strong number
			//taking last digit of number 
			d=n%10;
			fact=1;
			//for(y=1;y<=d;y++) {
				
				//fact=fact*y; //calling method to calculate factorial 
			
				
			
			sum=sum+fact;
			n=n/10;
		}
		if(temp==sum) //checking it's strong or not
			System.out.println(temp+" is a strong number");
		else 
			System.out.println(temp+" is not strong number");
			
	}
	
	public static void main(String[]args) {
		int x;
		Scanner sc=new Scanner(System.in); //creating object for scanner class
		System.out.println("Enter Number to Check it's Strong Number or Not ");
		x=sc.nextInt(); //taking input from user
		StrongNo.strong(x); //calling method strong
				
	}
}

