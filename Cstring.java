
public class Cstring {
	String a;
	String b;
	void getString(Cstring ref)
	{
		System.out.println(ref.a+ref.b);
	}

	public static void main(String[] args) {
		Cstring obj=new Cstring();
		obj.a="manisha";
		obj.b="loves";
		obj.getString(obj);

	}

}
