package May13;

public class Bank
{
	int initamt=500;
	
	public Bank()
	{
		super();
	}

	void withdraw(int wamt)
	{
		if(initamt>=wamt)
		{
			System.out.println("amount is withdraw....");

		}
		else
		{
			System.out.println("amount is not withdraw...");
		}
	}
	void deposit(int damt)
	{
		int Total = initamt+damt;
		System.out.println(Total);
		System.out.println("Amount is successfully deposit...");
	}
}
