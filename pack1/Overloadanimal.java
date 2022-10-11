package pack1;

 public class Overloadanimal
{
	}
 class  Horse extends Overloadanimal{

} 
 class x
 {
	public void display(Overloadanimal a)
		{
			System.out.println("animal workout");
		}
	public void display(Horse s)
		{
			System.out.println("horse workout");
		}

 
	public static void main(String[] args) {
		UseAnimals u=new UseAnimals();
		Horse h=new Horse();
		Overloadanimal o=new Overloadanimal();
		Overloadanimal p=new Horse();
		u.display(o);
		u.display(h);
		u.display(p);
	}
	}


 
