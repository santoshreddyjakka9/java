import java.util.Scanner;
public class MinMax {
	
		void min(int x, int y)
		{
			if(x>y)
				System.out.println(+x+ "x is greater");
			else
				System.out.println(+y+"y is greater");
		}
	
		public static void main(String[] args)
		{
			MinMax m=new MinMax();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter numbers");
			int c=sc.nextInt();
			int d=sc.nextInt();
			m.min(c,d);
			
		}
	}
	

