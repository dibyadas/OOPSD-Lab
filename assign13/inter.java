import java.io.*;
import java.lang.*;

interface picture { float area(); void increase_size(); void print_size();}

class rectangle implements picture {
 	float p,q;

 	public rectangle(float a, float b) {
		p = a;
		q = b;
	}

	public float area() {
		return p * q;
	}

	public void increase_size(){
		p += 5;
		q += 7;
	}

	public void print_size(){
		System.out.println("Length= "+ p+ " Breadth= " + q);
	}
}


class circle implements picture {
	float r;
	public circle(float a) { 
		r = a;
	} 
	public float area() {
 		return (float)3.14*r*r;
	}

	public void increase_size(){
		r += 10;
	}

	public void print_size(){
		System.out.println("Radius= "+ r);
	}
}

class ravi{
	public static void main(String args[]) throws Exception{
		picture p[] = new picture[20];
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
					p[n] = new circle(a);
					System.out.println(n+" is circle radius "+a);
				}
				if( w == 'R'){
					n = n + 1;
					i = s.indexOf(',');
					t = s.substring(1,i); a = Float.parseFloat(t); 
					u = s.substring(i + 1); b = Float.parseFloat(u);
					p[n] = new rectangle(a, b);
					System.out.println(n + " is rectangle length=" + a + " breadth= " +b);
				}
				if( w == 'A' ){
					v = s.charAt(1);
					i = (int)v - 48;
					System.out.println(p[i].area());	
				}
				if( w == 'B' ){
					v = s.charAt(1);
					i = (int)v - 48;
					p[i].increase_size();
				}
				if( w == 'D' ){
					v = s.charAt(1);
					i = (int)v - 48;
					p[i].print_size();
				}
			} catch(StringIndexOutOfBoundsException e){
				System.out.println("No input provided! Exiting...");
				System.exit(1);
			}
			
		}while( 1 == 1 );
	}
}
      