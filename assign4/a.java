import java.io.*;

class kapil {
	public static void main(String[] args) throws Exception {
		DataInputStream o = new DataInputStream(System.in);
		String a,b;
		System.out.println("Give a string:-");
		a = o.readLine();
		b = a.substring(2,5);  //;
		System.out.println(b);
	}
}