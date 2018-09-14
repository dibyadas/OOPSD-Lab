import java.io.*;

class two {
	public static void main(String[] args) throws Exception {
		DataInputStream o = new DataInputStream(System.in);
		String a,b,c;
		System.out.println("Give a string:-");
		a = o.readLine();
		// b = o.readLine();  //;
		System.out.println(a.substring(1,2) + a.substring(0,1) + a.substring(2,a.length()) );
	}
}
