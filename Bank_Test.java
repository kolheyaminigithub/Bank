package May13;

import java.util.Scanner;

public class Bank_Test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many amount you want to withdraw:");
		int wamt = sc.nextInt();
		System.out.println("How many amount you want to deposit:");
		int damt = sc.nextInt();
		
		new Bank().withdraw(wamt);
		
	}

}
