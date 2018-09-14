import java.io.*;


class test1 {
	public static void main(String[] args) throws Exception {
		DataInputStream o = new DataInputStream(System.in);
		String a,b;
		a = o.readLine();
		int len = check(0,a);
		System.out.println(len);
	}

	public static int check(int maxlen,String b){
		try{
			b.charAt(maxlen);
			return check(maxlen+1,b);
		}
		catch (StringIndexOutOfBoundsException e){
			return maxlen;
		}
	}
}