
public class Constructor {
	int a;
	String b;
	Constructor(int c,String d)
	{
		a=c;
		b=d;
	}
	

	public static void main(String[] args)
	{
		Constructor k=new Constructor(45,"jay");
		System.out.println(k.a+k.b);

	}

}
