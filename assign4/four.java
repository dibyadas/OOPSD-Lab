import java.io.*;
import java.util.Arrays;

class four {
	public static void main(String[] args) throws Exception {
		DataInputStream o = new DataInputStream(System.in);
		String a,b,c;
		System.out.println("Give a string:-");
		a = o.readLine();
		// b = o.readLine();  //;
		// System.out.println( a.substring(a.indexOf('x')+1,a.length()) );
		// b = a.substring(0,a.indexOf('x')) + "y" + a.substring(a.indexOf('x')+1,a.length()) ;
		// System.out.println( b );

		// 12
		// try{
		// 	b  = a.substring(0,a.indexOf('x',a.indexOf('x')+1));
		// 	System.out.println( b );	
		// }
		// catch (StringIndexOutOfBoundsException e) {
		// 	System.out.println("insufficient x");	
		// } 

		// 14
		// try{
		// 	b = a.substring(0,a.indexOf('x',a.indexOf('x')+1)) + "y" + a.substring(a.indexOf('x',a.indexOf('x')+1)+1,a.length()) ;
		// 	System.out.println( b );	
		// }
		// catch (StringIndexOutOfBoundsException e) {
		// 	System.out.println("insufficient x");	
		// } 

		// 15
		// try{
		// 	b = a.substring(0,a.indexOf('x')+1) + a.substring(a.indexOf('x',a.indexOf('x')+1),a.length()) ;
		// 	System.out.println( b );	
		// }
		// catch (StringIndexOutOfBoundsException e) {
		// 	System.out.println("insufficient x");	
		// } 

		// 16
		// try{
		// 	b = a.substring(a.indexOf('x'),a.indexOf('x',a.indexOf('x')+1)) + a.substring(0,a.indexOf('x')) + a.substring(a.indexOf('x',a.indexOf('x')+1)+1,a.length()) ;
		// 	System.out.println( b );	
		// }
		// catch (StringIndexOutOfBoundsException e) {
		// 	System.out.println("insufficient x");	
		// } 
		
		



	}
}
