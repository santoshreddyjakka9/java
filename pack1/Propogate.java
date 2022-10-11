package pack1;
import java.io.*;
public class Propogate {
	public static void main (String[] args) {
		try {
		RandomAccessFile raf=new RandomAccessFile("myfile.txt","r");
		byte b[]=new byte[1000];
		raf.readFully(b, 0, 1000);
		}
		catch(FileNotFoundException e) {
			System.err.println("file not found");
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		catch (IOException e) {
			System.err.println("error");
			System.err.println(e.toString());
			e.printStackTrace();
		}
	}
}
