package OOps;

	import java.util.Scanner;

	class AccountDetails{
		//Delearing instance variables 
		private long accountNo;
		private String AccHolderName;
		private int accBalance;
		private String accType;
		
		public AccountDetails( long accountNo ,String AccHolderName,int accBalance,String accType)//Initializing variables with help of method
		{
			this.accountNo=accountNo;
			this.AccHolderName=AccHolderName;
			this.accBalance=accBalance;
			this.accType=accType;
		
	}
     //checking withdraw
	public void withdraw(int accBalance ) {
		if(this.accBalance>accBalance) {
			this.accBalance=this.accBalance-accBalance;
			System.out.println("withdraw succesful...\n current balance is"+this.accBalance);
			
		}
		else {
			System.out.println("you dont have sufficient balance");
		}
		}
	//checking deposit
	public void deposit(int accBalance ) {
		this.accBalance=this.accBalance+accBalance;
		System.out.println("desposit succsfull\n your current balance is: "+this.accBalance);
	}
	public void check() {
		
		System.out.println("your balance is: "+this.accBalance+" "+"your account number is: "+this.accountNo+"\n "
			+"your account type is: "+this.accType);
	}
	}

		
	public class BalanceCheck {

		public static void main(String[] args) {
			int san,a;  //declearing variables
			AccountDetails sinu=  new AccountDetails (40436327,"Spravat Mondol", 40000, "saving"); //creating object for StudentDetails class
			//Get Specific Property
			System.out.println("enter following numbers to do operations\n 1.withdraw\n 2.Deposit\n 3.check blance");
			Scanner sc=new Scanner(System.in); //creating object for scanner class
			san=sc.nextInt(); //taking input from user
			
			switch (san) {
           // case statesments
			  case 1:
				  System.out.println("Enter Amount You Want To Withdraw");
				  a=sc.nextInt();
				  sinu.withdraw(a);
			
			    break;  
			  
			  case 2:
				  System.out.println("Enter Amount You Want To Deposit");
				  a=sc.nextInt();
				  sinu.deposit(a);
			    break;  
			  case 3:
				 
				  sinu.check();
			    break;  
			  
			  
			  default:
				  System.out.println("Please Make A Correct Choice");
			   
			  } 
		}

	}

