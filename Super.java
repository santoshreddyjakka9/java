class Exercise{ //usage of super to invoke parent class method
	void display()
	{
		System.out.println("arms workout");
	}
	
}
	class Gym extends Exercise
	{
		void display()
		{
			System.out.println("chest work out");
			super.display();
		}
	
}
public class Super {

	public static void main(String[] args) {
		Gym b=new Gym();
		b.display();
	
	}

}

