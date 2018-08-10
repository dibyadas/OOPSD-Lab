import java.io.*;

class thirteen
{
	public static void main(String args[]) throws Exception {
		DataInputStream stream = new DataInputStream(System.in);
		String k1;
		k1 = stream.readLine();
		char ch[] = k1.toCharArray();
		char temp = ch[0];
		ch[0] = ch[1];
		ch[1] = temp; 
		System.out.println(ch);
	}
	
}