package intern;

import java.util.*;
import java.lang.*;

public class random {

	static int score=0;
        static int option;
	public static void game() 
	{
		Scanner sc=new Scanner(System.in);
		
		int from = 1;
		int to = 100;
		int guess=0;
		int random = (int) (Math.random()*(to-from+1)+from);
        int attempt = 0;
        int a=3;
        
    	System.out.println(" ");
    	System.out.println("----------------------------------");
    	System.out.println("       NUMBER GUESSING GAME       ");
    	System.out.println("----------------------------------");
         		
		while(guess != random && attempt < 3) 
		{
			
			System.out.println(" ");
			
			System.out.println(" You Have "+a+" Attempts To Guess :- ");
			System.out.println(" ");
			System.out.println("Enter Yor Guess :- ");
			
			--a;
			guess = sc.nextInt();
			
		    attempt++;
			if(guess==random) 
			{
				System.out.println(" Your Guess Is Correct ");
				score++;
				System.out.println("WOW You Won...");
			}
			else if(guess > random) 
			{
				System.out.println(" Your Guess Is Too High");
			}
			else 
			{
				System.out.println(" Your Guess Is Too Low");
			}
			
		}	
		
     	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
	
		int a = 0 ;
		game();
		
	while(a<2)
	{	
		System.out.println(" ");
		System.out.println("=====================================================================");
		System.out.println(   " Do You Want To Play Again :-) \n"
							+ "\n"
							+ " Press 1 to Play \n"
							+ " Press 2 see score ");
		System.out.println("=====================================================================");
		 option =sc.nextInt();
		 
		
		if(option == 1) 
		{
			 game();
			 
		}
		else 
		{
			a=option;
			
		}
	}
	System.out.println("");
	System.out.println("*******************************************************************");
	System.out.println("Your Score : "+score);
	System.out.println(" ");
	System.out.println("Thanks To Play... :-)");
	System.out.println(" ");
	System.out.println("*******************************************************************");
		
		
		
		
	}
	
}
