package pack2;
import java.util.*;

public class Listarray {

	public static void main(String[] args) {
		List<String> c=new ArrayList<String>();// creates new array list c
		c.add("oslo");
		c.add("paris");
		c.add("Rome");
		//int p=c.indexOf("paris");
		int d=c.indexOf("Rome");
		System.out.println(c+ "   "  + " "+ d);
		//c.add(p,"london");
		c.add(d,"houston");
		System.out.println(c);
	}

}
