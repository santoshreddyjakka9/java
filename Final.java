class F // if we give final keyword to class we cannot extend
{
	 void fun() // if we write final keyword here it will accept as you cannot override
	{
	System.out.println("laddu");
	}
}

public class Final extends F
{
	void fun()
	{
		System.out.println("my name");
		
	}

	public static void main(String[] args) {
		F f=new Final();
		f.fun();//calling method
	}

}
