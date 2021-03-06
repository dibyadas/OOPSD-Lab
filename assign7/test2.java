import java.io.*;
import java.lang.*;
import java.util.*;


class test2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();

		check(a);
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

	public static void check(String a){
		int x = 1000;
		try{
			x = Integer.parseInt(a);       // check for string

			int[] tmp = new int[11];
			int f = tmp[x];

			int res = x / (x/5);               // ok for "x >= 5"
			
			x += 2;
			String z = Integer.toString(x);
			res = z.charAt(1);                // means x = 8, 9

			System.out.print('S');

		}

		catch(NumberFormatException e){
			System.out.println(check(0,a));
			System.exit(0);
		}

		catch(ArithmeticException e){
			System.out.print('Q');
		}

		catch(ArrayIndexOutOfBoundsException e){
			System.out.print('P');
		}

		catch(StringIndexOutOfBoundsException e){
			System.out.print('R');
		}

		try{
			x = x / (x - 12);
		}	
		catch(Exception e){
			System.out.println();
			x = x / (x - 12);
		}

		System.out.println('C');

	}

}
