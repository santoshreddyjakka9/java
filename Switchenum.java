import java.util.*;

enum shoes{adidas,puma,rebok,sketcher;}

public class Switchenum {

	public static void main(String[] args) {
shoes s=shoes.sketcher;
shoes b=shoes.rebok;

switch(s) {
case adidas:System.out.println("adidas my shoes");break;
case puma:System.out.println("puma my shoes");break;
case rebok:System.out.println("rebok my shoes");break;
case sketcher:System.out.println("sketcher my shoes");break;

}
switch(b) {
case adidas:System.out.println("adidas my shoes");break;
case puma:System.out.println("puma my shoes");break;
case rebok:System.out.println("rebok my shoes");break;
case sketcher:System.out.println("sketcher my shoes");break;

}	
		

	}

}
