package pack1;

public class Flip2 {

	public static void main(String[] args) {
		String o="-";
		String[] sa= new String[4];
		for(int i=0;i<args.length;i++) // length is 4 
			sa[i]=args[i];
		for(String n: sa) {
			switch (n.toLowerCase()) {
			case "yellow": o+="y";
			case "green": o+="g";
			case "red": o+="r";
			}
		}
System.out.println(o);
	}

}
