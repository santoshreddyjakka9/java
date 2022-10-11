package pack2;

public class Stringtypes {

	public static void main(String[] args) {
		String s=" skylab is";
		String s1=new String("fff");
		String s2=new String("fgh");
		String s3=new String("FFF");
		String s4="";
		System.out.println(s.charAt(4));//returns char value at 4
		System.out.println(s2.lastIndexOf('h'));//returns specified char value
		System.out.println(s1.contains(s3));//returns t or f after matching sequence of char value
		System.out.println(s.length());// returns string length
		System.out.println(s1.endsWith(s3));// returns true or flase
		System.out.println(s.replace('s','f'));// replaces specified char value
		System.out.println(s1.toUpperCase());//returns string to uppercase
		System.out.println(s2.toLowerCase());//returns string to lowercase
		System.out.println(s.concat(s1));// concatenates specified string
		System.out.println(s.substring(3));//returns substring for given begin index
		System.out.println(s1.equals(s3));//checks both string same or not
		System.out.println(s1.equalsIgnoreCase(s3));//checks both string t or f by ignoring case
		System.out.println(s4.isEmpty());// returns t or f if string is empty or not
		System.out.println(s.trim());// trims begining and ending spaces of string
		
		
		
		
		
	}

}
