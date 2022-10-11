 public class Helloworld 
		 {
	 public static void main(String[] args)
			{
		       // Two obj = new Two();
				Two oth=new Over();
				oth.print();
				oth.print(10,20);
				oth.print(30,40);

			}
		 }
 class Two
{
	void print()
	{
		System.out.println("hello world");
	}
	void print(int a, int b)
	{
		
		System.out.println(a+b);
	}
}
	class Over extends Two
	{
		void print(int a, int b)
		{
			System.out.println("the value is"+a+b);
			
		}

	}