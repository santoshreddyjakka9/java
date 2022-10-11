
public class Cfloat {
float a;
float b;
void getFloat(Cfloat rev,Cfloat rev1)
{
	System.out.println(rev.a+rev1.b);
}
	public static void main(String[] args) {
		Cfloat obj=new Cfloat();
		Cfloat obj1=new Cfloat();
		obj.a=22.2f;
		obj1.b=34.7f;
		obj.getFloat(obj,obj);

	}

}
