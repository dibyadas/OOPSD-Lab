import java.io.*;
import java.lang.*;

class complex{
	float real, img;
	public complex(float a, float b){real=a;img=b;}
	public complex(){}
	public void st(float x, float y){real=x;img=y;}
	public void print1(){System.out.println(real+"+"+img+"i");}
	public void duble(){ real=2*real; img=2*img;}
	public void ktimes (int k) {real=k*real;img=k*img;}
	private float magsq(){return real*real+ img*img;}
	public float magnitude() {float t; t=(float)Math.sqrt(this.magsq()); return t;}
	public static void print2 (complex a){
		System.out.println(a.real+"+"+a.img+"i");
	}
	public void add (complex x){ real=real+x.real;img=img+x.img;}

	public void add (complex x, complex y){
		real = x.real+y.real; img = x.img + y.img;
	}
	public complex add3 (complex x){
		complex c; float a,b; c = new complex();
		a = real+ x.real; b=img+x.img;
		c.st(a,b);
		return c;
	}

	public static complex add4 (complex x, complex y){
		complex c; float a,b; c = new complex();
		a = x.real+y.real; b = x.img + y.img;
		c.st(a,b);
		return c;

	}
	public float getreal() {return (real);}
	private float getimaginary(){ return (img);}
}
	class hari{
		public static void main(String args[]){
			complex t,s,r,m; float j;
			t=new complex (); s=new complex();r=new complex();
			t.st(4,2);t.duble();t.print1();
			t.st(4,2);t.ktimes(10); t.print1();
			t.st(4,3);j=t.magnitude(); System.out.println(j);
			t.st(4,2);t.print1();s.print2(t); complex.print2(t);
			s.st(2,7);t.st(4,2);s.add(t);s.print1();
			s.st(2,7);t.st(4,3);r.add(s,t); r.print1();
			s.st(2,7);t.st(4,23);r=s.add3(t); r.print1();
			s.st(2,7);t.st(4,2);r=complex.add4(s, t);r.print1();
			System.out.println(s.getreal());
			m=new complex(23,-45); m.print1();
		}
		
	}