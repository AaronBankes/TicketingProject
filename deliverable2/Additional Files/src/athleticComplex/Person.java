package athleticComplex;

public class Person 
{
	String name;
	private int balance;
	private boolean cardOnFile;
	
	public Person(String n, int b, boolean c)
	{
		this.name = n;
		this.balance = b;
		this.cardOnFile = c;
	}
	
	public boolean hasCredit(int price)
	{
		return (this.balance >= price | cardOnFile)? true : false;
	}
}