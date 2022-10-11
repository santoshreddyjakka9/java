
public class Thisconstructor extends Code{

	 void main(Thisconstructor obj)
	{

		System.out.println("hi ");
	}
	  void main1()
	{
		main(this);
		
	}
	public static void main(String[] args)
	{
		Thisconstructor b=new Thisconstructor();
		b.main1();
		

	}

}
