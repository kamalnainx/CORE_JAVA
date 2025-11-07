package chapter05;


class SavingAccount extends FixedAccount
{
	int rate = 12;
	float savingInterest;
	void calculateInterest()
	{
		display();
		savingInterest = (balance * rate * timePeriod) / 100;
		System.out.println("The interest calculated for the saving account at " + rate + "% of interest is: $" + savingInterest);
	}

}