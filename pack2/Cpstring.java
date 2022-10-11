package pack2;
// string stringbuffer ex
public class Cpstring {
	static String s="abcdef";
	public static void main(String[] args) {
		//String s="abcdef";
		String s2="more stuff";
		System.out.println(s=s.concat(s2));
		System.out.println(s=s.toUpperCase());
		System.out.println(s=s.replace('F', ' '));
		s2+="baby";
		System.out.println(s2+ " "+s);
		String s=new String("ghij");
		System.out.println(s);
		System.out.println(s.charAt(2));//returns char at specified index(zero based)
		System.out.println(s.equalsIgnoreCase("ghij"));// returns t r false
		System.out.println(s.length());
		StringBuilder sb=new StringBuilder("zxcv");
		sb.append("bnm");
		System.out.println(sb);
		StringBuilder sz=new StringBuilder("0123456789");
		System.out.println(sz.delete(4,6));//zero based
		System.out.println(sz.insert(4, "---"));
	}

}
