package pack2;

public class Guessanimal {
	 
	public static void main(String[] args) {
		String animal="unknown";
		int weight = 700;
		char sex='m';
		double colorWaveLength=1.630;
		if(weight>=500) {animal="elephant";}
		if(colorWaveLength > 1.621) {animal ="gray"+animal;}
		if(sex<='f') {animal="female"+animal;}// comparing between characters
		System.out.println("the animal is a"+animal);
		System.out.println(animal);
	}

}
