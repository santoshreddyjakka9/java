package pack1;


class Test {
	
	  public static void main(String[] args) {

	    // create a string
	    String name = "Aradra";

	    System.out.println("Characters in " + name + " are:");
	    // loop through each element
	    for(int i = 0; i<name.length(); i++) {

	      // access each character
	      char a = name.charAt(i);
	     if(name.charAt(i)!='r') 
	      System.out.print(a);
	    }
	  }
	}
