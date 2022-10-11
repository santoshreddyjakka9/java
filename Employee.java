
public class Employee extends Person {

	void displayType(Employee r)
	{
		System.out.println(r.Type);
	
	}
		
public static void main(String[] args)
{
	Person per=new Employee();
	Person per1=new Person();
	per1.Type="This is person";
	per.Type="This is Employee";
	per.displayType(per);
	per1.displayType(per1);
	
}
	}


