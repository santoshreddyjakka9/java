import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int a[]=new int[10];
		Scanner scannervalue=new Scanner(System.in);
		System.out.println(" size less then 10");
		int c=scannervalue.nextInt();//input size
		System.out.println("size is"+ c);
		System.out.println(" enter num");
		for(int i=0;i<c;i++) 
		a[i]=scannervalue.nextInt();//input by user
		
		System.out.println("hello");
		
		for(int i=0;i<c;i++) //to print what is there in array
		{
			System.out.println(a[i]);
			//System.out.println(a[6]);
	}
		
}
}
