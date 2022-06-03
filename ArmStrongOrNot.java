package BasicPrograms;

import java.util.Scanner;

public class ArmStrongOrNot {
	
	
	public static void ArmsNo(int no) { //creating method to check armstrong number
        int temp,result=0,digit; //declaring variables

        temp = no;

        while (temp!= 0) //Initializing loop
        {
            digit = temp%10; //Calculating last digit
            result=result+(digit*digit*digit); //calculating cube of the last digit 
            temp=temp/10; //removing last digit 
       
        }

        if(result == no) //checking armstrong or not
            System.out.println(no + " is an Armstrong number.");
        else
            System.out.println(no + " is not an Armstrong number.");
    }
	public static void main(String[] args){
		int jn; //declearing variables
		Scanner sc=new Scanner(System.in); //creating scanner calss object 
		System.out.println("enter number to check it's arms");
		jn=sc.nextInt(); //taking input from the user
		ArmsNo(jn); //calling method arm
	}
}


