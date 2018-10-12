import java.io.*;
import java.lang.*;

class kapil{

	// Q1
	// public static void main(String[] args) throws Exception {
	// 	int b = 10;
	// 	try{
	// 		DataInputStream o = new DataInputStream(System.in);
	// 		String a = o.readLine();
	// 		b = Integer.parseInt(a);
	// 	} finally {
	// 		System.out.println(b*b);
	// 	}
	// }

	// Q2 
	// public static void main(String[] args) throws Exception {
	// 	String b = "ram";
	// 	try{
	// 		DataInputStream o = new DataInputStream(System.in);
	// 		String a = o.readLine();
	// 		b = Integer.toString((Integer.parseInt(a)*Integer.parseInt(a)));
	// 	} finally {
	// 		System.out.println(b);
	// 	}
	// }

	// Q3
	// public static void main(String[] args) throws Exception {
	// 	String b  = "ram";
	// 	try{
	// 		DataInputStream o = new DataInputStream(System.in);
	// 		String a = o.readLine();
	// 		b = a;
	// 		int db = Integer.parseInt(b)*2;
	// 		System.out.println(db);
	// 	} finally {
	// 		System.out.println(b);
	// 		int sq = Integer.parseInt(b)*Integer.parseInt(b);
	// 		System.out.println(sq);
	// 	}
	// }

	// Q4
	// public static void main(String[] args) throws Exception {
	// 	String b  = "toy";
	// 	try{
	// 		DataInputStream o = new DataInputStream(System.in);
	// 		String a = o.readLine();
	// 		int db = Integer.parseInt(a)*2;
	// 		System.out.println(db);
	// 		b = a;
	// 	} finally {
	// 		System.out.println(b);
	// 		int sq = Integer.parseInt(b)*Integer.parseInt(b);
	// 		System.out.println(sq);
	// 	}
	// }

	// Q5
	// public static void main(String[] args) throws Exception {
	// 	String b  = "toy";
	// 	int db;
	// 	try{
	// 		DataInputStream o = new DataInputStream(System.in);
	// 		String a = o.readLine();
	// 		db = Integer.parseInt(a)*2;
	// 		b = db + "";
	// 	} finally {
	// 		System.out.println(b);
	// 		int sq = (Integer.parseInt(b)/2)*(Integer.parseInt(b)/2);
	// 		System.out.println(sq);
	// 	}
	// }

	// Q6
	// public static void main(String[] args) throws Exception {
	// 	String b  = "toy";
	// 	int db = 0;
	// 	try{
	// 		DataInputStream o = new DataInputStream(System.in);
	// 		String a = o.readLine();
	// 		db = Integer.parseInt(a)*2;
	// 		b = a;
	// 	} finally {
	// 		System.out.println(b);
	// 		float c = 1/db;
	// 		System.out.println(db);
	// 		int sq = (Integer.parseInt(b))*(Integer.parseInt(b));
	// 		System.out.println(sq);
	// 	}
	// }

	// Q7
	// public static void main(String[] args) throws Exception {
	// 	int m = 0,n = 0;
	// 	try{
	// 		DataInputStream o = new DataInputStream(System.in);
	// 		String a = o.readLine();
	// 		String[] words = a.split("\\s+");
	// 		m = Integer.parseInt(words[0]);
	// 		System.out.println(m*m);
	// 		n = Integer.parseInt(words[1]);
	// 	} finally {
	// 		int c = 1/n;
	// 		System.out.println(n*n);
	// 	}
	// }

	// Q8  [Incomplete]
	// public static void main(String[] args) throws Exception {
	// 	int m = 0,n = 0;
		
	// 	try{
	// 		DataInputStream o = new DataInputStream(System.in);
	// 		String a = o.readLine();
	// 		int g = 0;
		
	// 		int index = a.substring(g).indexOf(' ');
	// 		m = Integer.parseInt(a.substring(g,index));
	// 		g = index + 1;

	// 		index = a.substring(g).indexOf(' ');
	// 		n = Integer.parseInt(a.substring(g,index));
	// 		g = index + 1;


	// 	} finally {
	// 		// m = Integer.parseInt(words[0]);
	// 		System.out.println(m*m);
	// 		// n = Integer.parseInt(words[1]);
	// 		int c = 1/n;
	// 		System.out.println(n*n);
	// 	}
	// }

	// Q8A
	// public static void main(String[] args) throws Exception {
	// 	int m = 0,n = 0;
	// 	String []words = "1  1".split("\\s+");
	// 	try{
	// 		DataInputStream o = new DataInputStream(System.in);
	// 		String a = o.readLine();
	// 		words = a.split("\\s+");
	// 		m = Integer.parseInt(words[0]);
	// 		System.out.println(m*m);
	// 		n = Integer.parseInt(words[1]);
	// 		int c = 1/n;
	// 		System.out.println(n*n);
	// 	} finally {
	// 	}
	// }

	// Q9
	// public static void main(String[] args) throws Exception {
	// 	int m = 0,n = 0,p = 0;
	// 	String []words = "1  1".split("\\s+");
	// 	try{
	// 		DataInputStream o = new DataInputStream(System.in);
	// 		String a = o.readLine();
	// 		words = a.split("\\s+");
	// 		m = Integer.parseInt(words[0]);
	// 		System.out.println(m*m);
	// 		n = Integer.parseInt(words[1]);
	// 		int c = 1/n;
	// 		p = Integer.parseInt(words[2]);
	// 		int c = 1/p;
	// 		System.out.println(p*p);
	// 	} finally {
	// 	}
	// }

	// Q12
	// public static void main(String[] args) throws Exception {
	// 	int n = 0;
	// 	String a = "";
	// 	try{
	// 		DataInputStream o = new DataInputStream(System.in);
	// 		a = o.readLine();
	// 		n = Integer.parseInt(a);
	// 		System.out.print("A");
	// 	} finally {
	// 		System.out.print("B");
	// 		try{
	// 			Integer.parseInt(a);
	// 			System.out.print("C");
	// 		} finally {}
	// 	}
	// }

	// Q14
	// public static void main(String[] args) throws Exception {
	// 	int n = 0;
	// 	String a = "";
	// 	String k = "gopal";
	// 	try{
	// 		DataInputStream o = new DataInputStream(System.in);
	// 		a = o.readLine();
	// 		k.charAt(a.length());
	// 		System.out.print("A");
	// 	} finally {
	// 		System.out.print("B");
	// 		try{
	// 			k.charAt(a.length());
	// 			System.out.print("C");
	// 		} finally {}
	// 	}
	// }

	// Q15
	public static void main(String[] args) throws Exception {
		int n = 0;
		String a = "";
		String k = "gopal";
		try{
			DataInputStream o = new DataInputStream(System.in);
			a = o.readLine();
			k.charAt(a.length());
			System.out.print("A");
		} finally {
			System.out.print("B");
			try{
				k.charAt(a.length());
				System.out.print("C");
			} finally {}
		}
	}

}