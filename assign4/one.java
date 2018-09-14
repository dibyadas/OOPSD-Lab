import java.io.*;

class one {
	public static void main(String[] args) throws Exception {
		DataInputStream o = new DataInputStream(System.in);
		String a,b,c;
		System.out.println("Give a string:-");
		a = o.readLine();
		b = o.readLine();  //;
		System.out.println(a + "t" + b);
	}
}