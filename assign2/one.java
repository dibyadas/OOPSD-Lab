import java.io.*;
import java.lang.*;

class point{
	private float x,y;
	public point(float a, float b){
		x = a;
		y = b;
	}
	public point(){}
	public void print(){
		System.out.println("("+x+","+y+")");
	}
	public void abc() {
		x = 2*x;
		y = 3*y;
	}
	public static point pqr(point a){
		point t;
		t = new point(2*a.x,3*a.y);
		return t;
	}
	public void ghi(point a){
		x = 2*a.x;
		y = 3*a.y;
	}
	public float getx() {
		return x;
	}


	///// user defined methods
	public void fa(){
		x = x + y;
		y = 2*y;
	}

	public void fb(){
		x = 2*x;
		y = x + y;
	}

	public void fc(){
		x = x + y;
		y = x*y;
	}

	public point fd(){
		return new point(x + y,x*y);
	}

	public point fe(){
		x = x + y;
		y = x*y;
		return new point(x,y);
	}

	public point ga(){
		return new point(x+y, 2*y);
	}

	public static point gb(point p){
		return new point(p.x+p.y, 2*p.y);
	}

	public static point kb(point p){
		return point.gb(p);
	}

	public void gc(point p){
		x = p.x + p.y;
		y = 2*p.y;
	}

	public point kc(point p){
		return p.ga();
	}

	public void gd(float k){
		x  = x + k;
		y = 2*y;
	}	

	public point ha(){
		return this.ga();
	}

	public point hb(){
		return point.gb(this);
	}

	public void hc(point p){
		gc(p);
	}

	public static abc faa(point p){
		return new abc(p.x+p.y,p.x*p.y,p.x-p.y);
	}

	public static abc kaa(point p){
		return point.faa(p);
	}

	public void fad(abc q){
		point temp = q.fac();
		x = temp.x;
		y = temp.y;
	}

}

class abc{
	private float a,b,c;
	public abc(float p, float q, float r){
		a = p;
		b = q;
		c = r;
	}
	public abc(){}
	public void print(){
		System.out.println("("+a+","+b+","+c+")");
	}

	// /// getters

	// public float geta(){

	// }

	//// user defined methods

	public static abc fab(point p){
		// return new abc(p.x+p.y,p.x*p.y,p.x-p.y);
		return point.faa(p);
	}

	public static abc kab(point p){
		return abc.fab(p);
	}

	public point fac(){
		return new point(a+b,b*c);
	}

	public point kac(){
		return this.fac();
	}


}

class xyz{
	float a,b;

	public xyz(){}

	public xyz(float a, float b){
		this.a = a;
		this.b = b;
	}

	public void pt(){
		(new point(a,b)).print();
	}

	public xyz f(){
		float ta,tb;
		ta = a;
		tb = b;
		a = ta + tb;
		b = 2*ta;
		return this;		
	}

	public xyz g(){
		return new xyz(10*a,15*b);
	}

	public static xyz h(xyz x){
		return new xyz(x.a+1,x.b+1);
	}

}


class hari{
	public static void main(String[] args) {
		// point a,b,c;
		// float t;
		// abc k;
		// a = new point(2,4);
		// a.print();
		// a.abc();
		// a.print();
		// a.fa();
		// a.print();
		// point q = a.fd();
		// q.print();
		// a.print();
		// q = point.kb(a);
		// q.print();
		// q.kc(a);
		// q.print();
		// b = new point(5,7);
		// b.print();
		// b.gd(12);
		// b.print();
		// point h = b.ha();
		// h.print();
		// k = point.faa(a);
		// k.print();

		xyz a,b;
		a = new xyz(2,3);
		a.pt();
		b = xyz.h(a.f().g());
		a.pt();
		b.pt();
	}
}


