package pack2;
import pack1.*; //import pack1.*(explicit package)
//import pack1.X implicit package

public class Z {
	public static void main(String[] args) {
		X obj=new X();
		obj.a=22;
		obj.b=55;
		obj.displayadd();
		

	}

}
