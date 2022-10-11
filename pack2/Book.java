package pack2;

public class Book {
	private String TITLE="MOS";
	public String gettitle() {
		return TITLE;
	} 

	public static void main(String[] args) {
		Book b=new Book();
		String s=b.gettitle();
		//if(s!=null) {
			String t=s.toLowerCase();
			System.out.println(t);
		//}

	}

}
