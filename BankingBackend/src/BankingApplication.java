import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		int balance=10000;
		int newBalance=0;
		int previoustransaction=0;
		while(true)
		{    
			System.out.println();//just for space
			System.out.println("Welcome !");
			System.out.println("What do you want us to do.kindly,choose from below.");
			System.out.println("Press 'Withdraw' button to withdraw amount...");
			System.out.println("Press 'Deposit'  button to deposit the amount...");
			System.out.println("Press 'Checkbalance'  button to check your balance...");
			System.out.println("Press 'previoustransaction' to get your last transaction...");
			System.out.println("Press 'Cancel' to exit...");
			
			String accountNo="xx1234";
			String  choice =scan.next();
			switch(choice.toLowerCase())
			{
			case "withdraw" :
				System.out.println("Enter amount to withdraw :");
				int  amount=scan.nextInt();
				newBalance=balance-amount;
				System.out.println("Please,take your card and wait for money...");
				System.out.println("Amount withdrawn is : "+amount);
				previoustransaction=-amount;      //saying it's debited
				break;
			case "deposit" : 
				System.out.println("Enter money to deposit :");
				int depositAmount=scan.nextInt();
				newBalance=balance+depositAmount;
				System.out.println("Your A/C "+accountNo+" credited INR "+depositAmount+" Avl Bal INR "+newBalance+"-SBI");
				previoustransaction=depositAmount;
				break;
			case "checkbalance" :
				System.out.println("Your A/C "+accountNo+" is INR "+newBalance);
				break;
			case "previoustransaction":
				if(previoustransaction >0)
				    System.out.println("Your previous transcation is :"+previoustransaction+"(cr)");
				else if(previoustransaction <0)
				    System.out.println("Your previous transcation is :"+Math.abs(previoustransaction)+"(dr)"); //it's not good to show negative debited amount
				break;
			default: //it handles cancel
				System.exit(0);
			}
			balance=newBalance;
			System.out.println("Thank you for choosing our ATM !");

		}


	}


}












