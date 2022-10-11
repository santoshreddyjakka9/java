class Check
{ //usage of super to parent class constructor
	
	Check()
	{
	
		System.out.println("bounces");
	}
	
}
	class San extends Check
	{
	San()
		{
			super();
			System.out.println("clears");
		
		}
	
}
public class Super2
{
	public static void main(String[] args)
	{
		San b=new San();
		
		
	
	}

}