import java.io.*;
import java.lang.*;


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

class hari{
	public static void main(String args[]) throws Exception{
		circle c[] = new circle[20];
		rectangle r[] = new rectangle[20];
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
					c[n] = new circle(a);
					type[n] = 'C';
					System.out.println(n+" is circle radius "+a);
				}
				if( w == 'R'){
					n = n + 1;
					i = s.indexOf(',');
					t = s.substring(1,i); a = Float.parseFloat(t); 
					u = s.substring(i + 1); b = Float.parseFloat(u);
					r[n] = new rectangle(a, b);
					type[n] = 'R';
					System.out.println(n + " is rectangle length=" + a + " breadth= " +b);
				}
				if( w == 'A' ){
					v = s.charAt(1);
					i = (int)v - 48;
					if( type[i] == 'C'){
						System.out.println(c[i].area());
					}
					if( type[i] == 'R'){
						System.out.println(r[i].area());
					}
				}
				if( w == 'B' ){
					v = s.charAt(1);
					i = (int)v - 48;
					if( type[i] == 'C'){
						c[i].increase_size();
					}
					if( type[i] == 'R'){
						r[i].increase_size();
					}
				}
				if( w == 'D' ){
					v = s.charAt(1);
					i = (int)v - 48;
					if( type[i] == 'C'){
						c[i].print_size();
					}
					if( type[i] == 'R'){
						r[i].print_size();
					}
				}
			} catch(StringIndexOutOfBoundsException e){
				System.out.println("No input provided! Exiting...");
				System.exit(1);
			}
		}while( 1 == 1 );
	}
}
      