package pack1;

public class Planeex {
static String s="-";
	public static void main(String[] args) {
		new Planeex().s1();
		System.out.println(s);
	}
void s1() {
	try {s2();}
	catch (Exception e) {s+="c";}
}
void s2() throws ArithmeticException{
	s3(); s+="2";
	s3(); s+="2b";
}
void s3() throws Exception{
	throw new Exception();
}
}
