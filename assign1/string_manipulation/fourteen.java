import java.io.*;

class fourteen
{
	public static void main(String args[]) throws Exception {
		DataInputStream stream = new DataInputStream(System.in);
		String k1;
		k1 = stream.readLine();
		char ch[] = k1.toCharArray();
		ch[0] = '\0';
		System.out.println(ch);
	}
	
}