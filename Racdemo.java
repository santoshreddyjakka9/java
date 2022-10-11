
import java.util.*;
class Racdemo
{
	static float n1,n2,n3,n4,n5,avg;
  public static void main(String args[])
  {
  Scanner s=new Scanner(System.in);
    n1= s.nextFloat();
    System.out.println("eneter the first racer");
    n2=s.nextFloat();
   System.out.println("enter the second racer");
    n3=s.nextFloat();
    System.out.println("enyter the third racer");
    n4=s.nextFloat();
    System.out.println("enter the fourth racer");
    n5=s.nextFloat();
    System.out.println("enter the fifth racer");
    avg=(n1+n2+n3+n4+n5)/5;
    System.out.println("averaage"+avg);
    if(n1>avg)
      System.out.println("1st racer winner");
    else if(n2>avg)
      System.out.println("2nd racer winner");
    else if(n3>avg)
      System.out.println("3rd racer winner");
    else if(n4>avg)
      System.out.println("4th racer winner");
    else if(n5>avg)
      System.out.println("5th racer winner");
  }
}
