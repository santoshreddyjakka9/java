class Body
{ //usage of super to refer instance variable
	String n="arms workout";
	void display()
	{
	
		System.out.println(n);
	}
	
}
	class Sam extends Body
	{
	String n="chest work out";
		void display()
		{
			
			System.out.println(n);
			System.out.println(super.n);	
		}
	
}
public class Super1
{
	public static void main(String[] args)
	{
		Sam b=new Sam();
		b.display();
		
	
	}

}