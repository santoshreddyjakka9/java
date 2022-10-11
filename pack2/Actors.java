package pack2;
//chapter 5 3 qestion
public class Actors {
public static void main(String[] args) {
	int [] num= {1,2,3,4};
	for(int a=0;a<num.length;a++)
		System.out.println(num[a]);
	for(int a:num) {
		System.out.println(a);
	}
}
}