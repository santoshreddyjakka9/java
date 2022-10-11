
public class Throws {
	int a;
	public void check() throws  ArithmeticException
	{
		if (a<18)
		{
			System.out.println(" not Eligible");
		}
		else
		{
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) {
		Throws n=new Throws();
		n.a=12;
		try{
			n.check();
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}

}
