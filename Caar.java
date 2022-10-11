abstract class Parts
{
	String n;
	Parts(String n)
	{
		this.n=n;
	}
	abstract void function();
	void f()
	{
		System.out.println(n);
	}
}
	class Brakes extends Parts
	{
		Brakes(String n)
		
		{
			super(n);	
		}
		void function()
		{
			System.out.println("car will stop");
		}
	}
	class Accelerate extends Parts
	{
		Accelerate(String n)
		{
		super(n);	
		}
		void function()
		{
			System.out.println("Car will move");
		}
	}
	
public class Caar {

	public static void main(String[] args) 
	{
		Brakes a=new Brakes("brakes");
		a.function();
		a.f();
		Accelerate b=new Accelerate("accelerate");
		b.function();
		b.f();
		
	}
}
