
public class Function {
public int I=20;
public static int s=55;
 
 public static void main(String[] args)
 {
	 Function k=new Function();
	 Function k1=new Function();
	 System.out.println(""+s);
	  k1.I=100;k1.s=300;
	 System.out.println(""+k.I);
	 System.out.println(""+k1.I);
	 System.out.println(""+k1.s);	 
	 System.out.println(""+ s);
 }
}
