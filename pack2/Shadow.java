package pack2;

public class Shadow {
	static int size=8;
	static void changeIt(int size ) {
		size=size+590;
		System.out.println("size in change it is"+ size);
	}

	public static void main(String[] args) {
		Shadow b=new Shadow();
		System.out.println("size ="+size);
		changeIt(size);
		int size2=size+1;
		
		System.out.println(size2);
		System.out.println("size after change it is "+ size);
		

	}

}
