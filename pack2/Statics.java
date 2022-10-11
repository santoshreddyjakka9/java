package pack2;

public class Statics {
	static int frogcount=0;
public Statics() {
	frogcount += 1;
}

	public static void main(String[] args) {
		new Statics();
		new Statics();
		new Statics();
		new Statics();
		new Statics();
		System.out.println("Frog count is now" + frogcount );
	}

}
