class JavaNiitclass
{
	public String number="1st";
	
	public void topic()
	{	
		System.out.println("java 1st demo");
	}	
}

class Niit extends JavaNiitclass
{
	
	
	public static void main(String[] agrs)
	{
		Niit jnc = new Niit();
		jnc.topic();
		System.out.println("this is var from java niit class"+jnc.number);
	}
}