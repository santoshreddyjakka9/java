public class Cstrng 
{	
		int a;
		int b;
		void print()
		{
			System.out.println("hello world");
		}
			void getDis(Cstrng rev)
			{
				System.out.println("chh"+(rev.a+rev.b));
			}
			
	
	public static void main(String[] args)
	{
	

		Cstrng option=new Three();
		
		option.a=22;
		option.b=34;
		option.getDis(option);
		
		option.print();
		
		

	}
}

	

class Three extends Cstrng
{
void getDis(Cstrng ref)
{
	System.out.println(ref.a+ref.b);
	System.out.println("hello");
}
}	

		
