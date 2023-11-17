package newproject;
import java.util.*;
class dom 
{
	Scanner sc=new Scanner(System.in);
	
	double atmbalance = 20000 ;
	double deposite ; 
	double withdraw ;
	double balance ;
	
	public void deposite() 
	{
		System.out.println("enter the amount :- ");
	    deposite = sc.nextDouble();
		balance = deposite ;
		System.out.println(" ");
		System.out.println("---------------------------------------------------");
		System.out.println(" ");
		System.out.println("Amount of RS " + deposite + " was deposited ... " );
		System.out.println(" ");
		System.out.println("---------------------------------------------------");
	}
	public void withdraw() 
	{
		System.out.println("enter the amount :- ");
	    withdraw = sc.nextDouble();
		if(withdraw<=balance) 
		{  
			System.out.println(" ");
			System.out.println("---------------------------------------------------");
			System.out.println(" ");
			System.out.println("Amount of RS " + withdraw + " was creadited ... " );
			System.out.println(" ");
			System.out.println("---------------------------------------------------");
			System.out.println(" ");
			
		}
		else 
		{ 
			System.out.println(" ");
			System.out.println("---------------------------------------------------");
			System.out.println(" ");
			System.out.println("Insufficiant Balance ...");
			System.out.println(" ");
			System.out.println("---------------------------------------------------");
			System.out.println(" ");
		}
		
	}
	public void balance () 
	{
		balance = 0;
		balance = (balance + deposite)-withdraw ;
		System.out.println(" ");
		System.out.println("---------------------------------------------------");
		System.out.println(" ");
		System.out.println(" REMAINING ACCOUNT BALANCE IS :- " + balance + " :-) " );
		System.out.println(" ");
		System.out.println("---------------------------------------------------");
		System.out.println(" ");
		
	}
}

class machine 
{

	public static void main(String[] args) {
		
		dom f = new dom();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ");
		
		int saa = 0 ;

	while(saa<2) {	
		
		System.out.println("=====================================================");
		System.out.println(" ");
		
							System.out.println(" what you what to do :- \n"
									+ " \n"
									+ " 1.deposite \n"
									+ " 2.withdraw \n"
									+ " 3.balance check ");
		
		System.out.println(" ");
		System.out.println("=====================================================");
		System.out.println(" ");
		
		int op = sc.nextInt();
		
		if(op==1) 
		{    
			System.out.println(" ");
			System.out.println("------------------------------------------------ ");
			f.deposite() ;
		    System.out.println(" ");
			
		}
		else if(op==2) 
		{
			System.out.println(" ");
			
			f.withdraw();
			System.out.println(" ");
			
			
		}
		else if(op==3)
		{
			System.out.println(" ");
			
			f.balance();
			System.out.println(" ");
			
			
		}
		else 
		{
			System.out.println(" ");
			
			System.out.println("input is blank ...");
		}
	
		System.out.println(" to contineu press 1 || to exite press 2");
	    saa = sc.nextInt();
	    
	    
	}
	System.out.println("System closed ... ");
    System.out.println(" ");
    System.out.println("Thank You For Banking Interest ... ");
    System.out.println(" ");
    System.out.println(" ");
	}
}

