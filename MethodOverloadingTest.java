
public class MethodOverloadingTest {
public  int addition(int a,int b)
	{
		return a+b;
		
	}
	public  int addition(int a,int b,int c)
	{
		return a+b+c;
		
	}
	public double addition(double a,double b,double c)
	{
		return a+b+c;
		
	}
	public static void main(String[] args) {
		MethodOverloadingTest n=new MethodOverloadingTest();
		System.out.println(n.addition(20, 30));
		System.out.println(n.addition(34,45,56));
		System.out.println(n.addition(34.4,56.8,67.9));
		
		
	}

}
//System.out.println(addition(12,22));
//System.out.println(addition(12.33,22.45,55.66));
//System.out.println(addition(12,22,45));
