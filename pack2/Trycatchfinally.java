package pack2;

public class Trycatchfinally
{
public static void main(String[] args)
{
try {
	int i=10/0;//exception
	System.out.println("men");
}	
catch(ArithmeticException num)
{
	System.out.println(num);
System.out.println(2);
}
catch(NumberFormatException num)
{
	System.out.println(num);
System.out.println(2);
}

finally
{
	System.out.println("i");
}
System.out.println("stop");
}

}

