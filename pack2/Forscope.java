package pack2;

public class Forscope {

	public static void main(String[] args) {
		
int x=1;
outer:
for(x=12;x<20;x++) { // variable scope is important like declaring and intializing varibale
	System.out.println(x);
	continue outer;
}
System.out.println(x);
int a=1; //we dont need to inrement or decrement we can put anything ex "iterate" here
for (int y=4;y!=a;System.out.println("iterate")) {
	y=y-a;
	
}
	}

}
