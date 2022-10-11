
public class Str {
 static String str="i-love-you" ;
 
 public static void splittingString()
{
String splittedstring[]=str.split("-");
int length=splittedstring.length;
for(int i=0;i<length;i++)
{
	System.out.println(splittedstring[i]);
}
}
public static void main(String[] args)
{
	
		Str k1=new Str();
		splittingString();
		System.out.println(str);
		
		
}
}