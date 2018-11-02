import java.io.*;
import java.lang.*;

class kapil{
	public static void main(String args[]) throws Exception{
		float c[] = new float[20];

		float rl[] = new float[20];
		float rb[] = new float[20];

		char type[] = new char[20];

		float a,b; 
		int i,n=0; 
		String s,t,u;
		char v,w;
		DataInputStream o = new DataInputStream(System.in);
		do {
			try{
				s = o.readLine(); w = s.charAt(0);
				if(w == 'C'){
					n = n+1;
					t = s.substring(1); a = Float.parseFloat(t);
					c[n] = a;
					type[n] = 'C';
					System.out.println(n+" is circle radius "+a);
				}
				if( w == 'R'){
					n = n + 1;
					i = s.indexOf(',');
					t = s.substring(1,i); a = Float.parseFloat(t); 
					u = s.substring(i + 1); b = Float.parseFloat(u);
					rl[n] = a;
					rb[n] = b;
					type[n] = 'R';
					System.out.println(n + " is rectangle length=" + a + " breadth= " +b);
				}
				if( w == 'A' ){
					v = s.charAt(1);
					i = (int)v - 48;
					if( type[i] == 'C'){
						System.out.println(c[i]*c[i]*3.14);
					}
					if( type[i] == 'R'){
						System.out.println(rl[i] * rb[i]);
					}
				}
				if( w == 'B' ){
					v = s.charAt(1);
					i = (int)v - 48;
					if( type[i] == 'C'){
						c[i] += 10;
					}
					if( type[i] == 'R'){
						rl[i] += 5;
						rb[i] += 7;
					}
				}
				if( w == 'D' ){
					v = s.charAt(1);
					i = (int)v - 48;
					if( type[i] == 'C'){
						System.out.println("Radius= "+ c[i]);
					}
					if( type[i] == 'R'){
						System.out.println("Length= "+ rl[i]+ " Breadth= " + rb[i]);
					}
				}
			} catch(StringIndexOutOfBoundsException e){
				System.out.println("No input provided! Exiting...");
				System.exit(1);
			}
		}while( 1 == 1 );
	}
}
      