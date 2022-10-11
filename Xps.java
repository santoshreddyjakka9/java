
public class Xps {
	double a;
	double b;
	
	void display(Xps re)
	{
		double c=(a+b);
		int d=(int) c;
		System.out.println(d);
		System.out.println(b);
		System.out.println(a);
		
	
	}
	public static void main(String[] args) {
		Xps print=new Xps();
		print.a=20.2f;
		print.b=30.3f;
		//print.c=print.a+print.b;
		//print.d=(int)print.c;
		print.display(print);
		 
	}

}
