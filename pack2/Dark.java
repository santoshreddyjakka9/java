package pack2;
// qestion 13 
public class Dark {
 int x=3;

	public static void main(String[] args) {
		new Dark().go1();
	}
	void go1() {
		//int x;
		go2(++x); // error x is not intialized local varibale
		
	}
		void go2(int y) {
			int x=++y;
			System.out.println(x);
		}

	}


