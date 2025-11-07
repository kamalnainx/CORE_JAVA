package chapter05;
class FixedAccount
{
	int accountNo = 2178;
	String accountName = "Steve";
	int balance = 500;
	float fixedInterest;
	int rate = 8;
	int timePeriod = 3;
	void display()
	{
		System.out.println("Account number is: " + accountNo);
		System.out.println("Account name is: " + accountName);
		System.out.println("Balance of " + accountName + " is: $" + balance);
	}
	void calculateInterest()
	{
		fixedInterest = (balance * rate * timePeriod) / 100;
		System.out.println("The interest calculated for the fixed account at " + rate + "% of interestis $" + fixedInterest);
	}
}
