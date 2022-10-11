
public class Switchprg {
	public static void main(String[] args) {
		String month="jan";
		int numofdays=0;
		switch(month) {
		case "jan":case "mar": case "may": case "jul": case "Aug": case "oct": case "Dec": numofdays=31;break;
		case "feb":numofdays=28;break;
		case "Apr": case "jun": case "sep": case "nov": numofdays=30;
		break;
		
		}
		System.out.println("the num of days in "+month+ " is "+numofdays);
	}

}
