
public class Throw {
	int a;
	public void check() {
		if (a<18) {
			throw new ArithmeticException("not eligible");
		}else 
			System.out.println("Eligible");
	}

	public static void main(String[] args) {
	Throw n=new Throw();
	n.a=14;
	try {
	n.check();
	}
	catch (ArithmeticException e) {
		e.printStackTrace();
	}
	

	}

}
