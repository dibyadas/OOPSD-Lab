import java.io.*;
import java.lang.*;

class f
{
	public static String rdstring() throws Exception {
		DataInputStream o = new DataInputStream(System.in);
		String a = o.readLine();
		return a;
	}


	public static int second (String a, char e) {
		String b; int p,q;
		p = a.indexOf(e);
		b = a.substring(p+1);
		q = b.indexOf(e);
		return (p+q+1);
	}
	
	 
	public static String del(String a, int k) {
		String b,c;
		b = a.substring(0,k) + a.substring(k+1);
		return b;	
	}
	
	 
	public static String delsec (String a, char e) {
		int p;
		p = second(a, e);
		return del(a, p);	
	}
	
}

class kapil {
	public static void main(String args[]) throws Exception {
		String a, k; int g,m;
		a = f.rdstring(); g = f.second(a,'x'); System.out.println(g);		
	}
}

class ram {
	public static void main(String args[]) throws Exception {
		String a, k; int g,m;
		a = f.rdstring(); m = Integer.parseInt(f.rdstring());
		k = f.del(a,m); System.out.println(k);
	}
}

class gopal {
	public static void main(String args) throws Exception {
		String a, b, k; char c;
		a = f.rdstring(); b = f.rdstring(); c = b.charAt(0);
		k = f.delsec(a, c); System.out.println(k);	
	}
}
