
public class Nokia {
	String Phone;
	int p;
	void displayType(Nokia r)
	{
	System.out.println(r.Phone);	
	}
	void displayType(Nokia r,Nokia p)
	{
	System.out.println(r.Phone+r.p);	
	}
	
	public static void main(String[] args) {
		Nokia cd=new Nokia();
		cd.Phone="model ";
		cd.p=21;
		cd.displayType(cd);
		cd.displayType(cd,cd);
		

	}

}
