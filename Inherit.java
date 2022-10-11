class Car{
	void printA()
	{
	System.out.println("moves on wheels");
	
}
}
class Toyota extends Intface{
void printB()
{
	System.out.println("rare design");
	}
}
class Spartan extends Intface{
void printC()
{
	System.out.println("detroit");
	}
}


public class Inherit {
	

	public static void main(String[] args)
	{
	Spartan b=new Spartan();
	Toyota c=new Toyota();
	Car d=new Car();
		b.printC();	
	c.printB();
	d.printA();
	}
	}




