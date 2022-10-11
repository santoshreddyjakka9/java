interface Printable
{
	int a=10;
	void print();
	}
interface Executes
{
	void show();
	
}
public class Intface implements Printable,Executes
{
  public void print()
{
	System.out.println("print");
	
	}
 public void show()
{
	System.out.println("execute");
	
	}
public class Ball extends Intface{} //example

	public static void main(String[] args) {
		Intface t=new Intface();
		t.print();
		t.show();
		
		System.out.println(t.a);
		
	}

}
