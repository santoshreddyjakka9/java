package pack2;

public class Classstc {
	public  int a=10;
	public  int b=39;
	public  int c;
	public static void display()
	{	
		
		Classstc obj=new Classstc();
		obj.display1();
	
		obj.c=obj.a+obj.b;
		System.out.println(obj.c);
	}
	public  void display1()
	{
		System.out.println("i am display 1");
	}
	public static void main(String[] args) {
		display();
		
		

	}

}
