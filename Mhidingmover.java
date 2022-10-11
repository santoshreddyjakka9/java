class Animal{
	  void run() //can be default and protected and public 
	  // cannot override method if marked static(methods cant be overriden), final
	{
		System.out.println("h--animal is walking");
	}
	  void run1()
	{
		System.out.println("0--animal is walking");
	}
}
class Cheetah extends Animal
{
	public void run()// cant be protected 
	{
		System.out.println("h--cheetah is walking");
	}
	public  void run1()
	{
		System.out.println("o--cheetah is walking");
	}
}
public class Mhidingmover
{


public static void main(String[] args)
{
	Animal b=new Cheetah();
Animal a=new Animal();
	b.run();
	b.run1();
	a.run();
	a.run1();
	
}	
	

}