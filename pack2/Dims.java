package pack2;

public class Dims {

	public static void main(String[] args) {
	int [] [] a= {{1,2},{3,4}};
	int [] b=(int []) a[1];
	Object o1=a;
	int [] [] a2=(int [] []) o1;
	int [] b2=(int []) o1; //coz o1 refers to int [][] not int []
	System.out.println(b[1]);

	}

}
