package newproject;

import java.util.*;

public class result {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println(" ... STUDENTS RESULTS ...");
		System.out.println(" ");
		
		System.out.println(" Enter The Marks Obtain In Marathi :- ");
		double sub1 = sc.nextInt();
		System.out.println(" ");
		System.out.println(" Enter The Marks Obtain In English :- ");
		double sub2 = sc.nextInt();
		System.out.println(" ");
		System.out.println(" Enter The Marks Obtain In Maths :- ");
		double sub3 = sc.nextInt();
		System.out.println(" ");
		System.out.println(" Enter The Marks Obtain In Physics :- ");
		double sub4 = sc.nextInt();
		System.out.println(" ");
		System.out.println(" Enter The Marks Obtain In Biology :- ");
		double sub5 = sc.nextInt();
		System.out.println(" ");
		
		double total = sub1+sub2+sub3+sub4+sub5;
		
		double avg = total/5;
		
		System.out.println(" Student Result  ");
		System.out.println(" ");
		
		if(avg>70 && avg <=100)
		{   
			System.out.println("Total Marks : " + total );
			System.out.println("Grade :- A ");
			System.out.println("Distiction : "+ avg + "%" );
		}
		else if(avg >= 60 && avg < 70) 
		{
			System.out.println("Total Marks : " + total );
			System.out.println("Grade :- B ");
			System.out.println("First Class : "+ avg + "%" );
		}
		else if(avg >= 50 && avg < 60) 
		{
			System.out.println("Total Marks : " + total  );
			System.out.println("Grade :- C ");
			System.out.println("Second Class : "+ avg + "%" );
		}
		else if(avg >= 35 && avg <50) 
		{
			System.out.println("Total Marks : " + total );
			System.out.println("Grade :- D ");
			System.out.println("Third Class : "+ avg + "%" );
		}
		else 
		{  
			System.out.println("Total Marks : " + total );
		    System.out.println("Grade :- F ");
			System.out.println("Fail : "+ avg + "%" );
	}
	
		sc.close();
	
	}
	
}
