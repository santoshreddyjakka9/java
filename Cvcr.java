
public class Cvcr {
int a;
int b;
void getAdd(Cvcr ref)
{
	System.out.println(ref.a+ref.b);
}
	public static void main(String args[]) {
		Cvcr obj=new Cvcr();
		obj.a=30;
		obj.b=55;
		obj.getAdd(obj);
		
	}
}
