package numbergame;

import java.util.random.*;
import java.util.*;

public class numgame {
	
	// if you lose play again
	static void lose_play_again()
	{
		System.out.println("\nYOU LOST! Number Not matched !");
		System.out.println("Good luck next time!");
		System.out.println("\n*******************************************************************************************************************************************************************************");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 to play again.");
		System.out.println("Enter 2 to get exit.");
		System.out.print("Choice : ");
		int choice = scan.nextInt();
		
		if(choice == 1)
		{
			rand_num();
		}
		else 
		{
			System.out.println("Wrong choice! Please try again.");
		}
		scan.close();
	}
	
	// if you win play again
	static void won_play_again()
	{
		System.out.println("\nGreat! You nailed it!");
		System.out.println("You matched the number.");
		System.out.println("You won!");
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("*******************************************************************************************************************************************************************************");
		System.out.println("Enter 1 to play again.");
		System.out.println("Enter 2 to get exit.");
		System.out.print("Choice : ");
		int choice = scan.nextInt();
		
		if(choice == 1)
		{
			rand_num();
		}
		else if(choice == 2)
		{
			System.exit(0);
		}
		else 
		{
			System.out.println("Wrong choice! Please try again.");
		}
		scan.close();
	}
	
	// game 
	static void rand_num()
	{
		Scanner sc = new Scanner(System.in);
		Random rdm = new Random();
		int random_num = rdm.nextInt(100);
		int num;
		
		System.out.println("Game Started !");
		for(num = 0; num<3; num++)
		{
		System.out.print("\nEnter your number : ");
		int n = sc.nextInt();
		
		System.out.println("\nNumber you entered : "+n);
		
		if(n == random_num)
		{
			System.out.println("Number matched !");
			System.out.println("YOU WON!");
			System.out.println("Random number "+random_num+" matches to your number "+n);
			won_play_again();
		}
		else 
		{
			System.out.println("Did match, Try again!");
			System.out.println("*******************************************************************************************************************************************************************************");
		}
		}
		
		if(num == 3)
		{
			System.out.println("Number randomly generated : "+random_num+ " doesn't match the number you enterd 3 times.");
			lose_play_again();
		}
		sc.close();
	}
	public static void main(String args[])
	{
		System.out.println("*******Number Game*********");
		System.out.println("*********WELCOME**********");
		System.out.println("Rules : ");
		System.out.println("1. You have 3 attempts.");
		System.out.println("2. You have to guess the number.");
		System.out.println("3. If the number you entered is matched with random number you win..");
		System.out.println("\nPlay and enjoy the game!\n");
		rand_num();
	}
} 