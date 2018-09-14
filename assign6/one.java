import java.io.*;

class kapil{
	
	public static void main(String[] args) throws Exception {
		// one();
		// two();
		// three();
		// four();
		// five();
		// six();
		// seven();
		// eight();
		nine();
	}

	public static void one() throws Exception {
		String a, c;
		char t;
		DataInputStream o = new DataInputStream(System.in);
		a = o.readLine();
		try{
			System.out.println(Integer.parseInt(a)*2);
		} catch(NumberFormatException e) {
			System.out.println(0);
		}
	}

	public static void two() throws Exception {
		DataInputStream o = new DataInputStream(System.in);
		String a = o.readLine();
		try{
			Integer.parseInt(a);
			System.out.print("A");
		} catch(NumberFormatException e) {
			System.out.print("B");
		} finally {
			System.out.println("C");
		}
	}

	public static void three() throws Exception {
		int[] arr = new int[5];
		DataInputStream o = new DataInputStream(System.in);
		String a = o.readLine();
		try{
			int c = Integer.parseInt(a);
			System.out.print("A");
			int g = arr[c];
			System.out.print("D");
		} catch(Exception e) {
			System.out.print("B");
		} finally {
			System.out.println("C");
		}
	}

	public static void four() throws Exception {
		int[] arr = new int[5];
		DataInputStream o = new DataInputStream(System.in);
		String a = o.readLine();
		try{
			int c = Integer.parseInt(a);
			System.out.print("A");
			int g = arr[c];
			System.out.print("D");
		} catch(NumberFormatException e) {
			System.out.print("B");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.print("E");
		} finally {
			System.out.println("C");
		}
	}

	public static void five() throws Exception {
		int[] arr = new int[5];
		DataInputStream o = new DataInputStream(System.in);
		String a = o.readLine();
		try{
			int c = Integer.parseInt(a);
			System.out.print("A");
		} catch(NumberFormatException e) {
			try{
				a.charAt(5);
				System.out.print("D");
			} catch (StringIndexOutOfBoundsException f){
				System.out.print("B");	
			}
			
		} finally {
			System.out.println("C");
		}
	}

	public static void six() throws Exception {
		int[] arr = new int[5];
		DataInputStream o = new DataInputStream(System.in);
		String a = o.readLine();
		try{
			int c = Integer.parseInt(a);
			System.out.print("A");
			// System.exit(0);
			int k = arr[c];
		} catch(NumberFormatException e) {
			System.out.print("B");
		}
			System.out.println("C");
		
	}

	public static void seven() throws Exception {
		int[] arr = new int[5];
		DataInputStream o = new DataInputStream(System.in);
		String a = o.readLine();
		try{
			int c = Integer.parseInt(a);
			System.out.print("A");
			c = Integer.parseInt("a");
		} catch(NumberFormatException e) {
			System.out.print("B");
		}
			System.out.println("C");	
	}

	public static void eight() throws Exception {
		int[] arr = new int[5];
		DataInputStream o = new DataInputStream(System.in);
		String a = o.readLine();
		try{
			int c = Integer.parseInt(a);
			System.out.print("D");
			c = arr[c];
			System.out.print("E");
		} catch(NumberFormatException e) {
			System.out.print("B");
		}
			System.out.println("C");	
	}

	public static void nine() throws Exception {   // wip
		int[] arr = new int[5];
		int temp;
		DataInputStream o = new DataInputStream(System.in);
		String a = o.readLine();
		try{
			int c = Integer.parseInt(a);
			System.out.print("B");
			temp = 10 / (n/5);
			System.out.print("D");
			temp = arr[c-6];
			System.out.print("E");

		} catch(Exception e) {
			System.out.print("A");
		}
		System.out.println("C");	
	}

}