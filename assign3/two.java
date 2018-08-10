import java.io.*;
import java.lang.*;

class vector{
	float a,b,c;

	public vector(float x,float y, float z){
		a = x;
		b = y;
		c = z;
	}

	public vector(){}

	public static void print(vector x){
		System.out.println(x.a+"i ,"+x.b+"j ,"+x.c+"k");
	}

	public void print(){
		vector.print(this);
	}

	public float dot(vector x){
		return a*x.a + b*x.b + c*x.c;
	}

	public float magnitude(){
		return (float)Math.sqrt(this.dot(this));
	}

	public vector cross_product(vector p,vector r){
		float x = p.b*r.c - p.c*r.b;
		float y = p.a*r.c - p.c*r.a;
		float z = p.a*r.b - p.b*r.a;
		return new vector(x,y,z);
	}

	public void divide(float k){
		a /= k;
		b /= k;
		c /= k;
	}

	public void unit(){
		this.divide(this.magnitude());
	}

	public vector direction(point a, point b){
		return point.dir(a,b);
	}
}

class point{
	float x,y,z;
	public point(float a, float b, float c){
		x = a;
		y = b;
		z = c;
	}

	public void print(){
		System.out.println("("+x+" , "+y+" , "+z+")");
	}

	public static point mid(point a, point b){
		return new point((a.x+b.x)/2,(a.y+b.y)/2,(a.z+b.z)/2);
	}

	public static vector dir(point a, point b) {
		return new vector(b.x-a.x,b.y-a.y,b.z-a.z);
	}

	public static float area(point p, point q, point r){
		vector dir_pq = point.dir(p,q);
		vector dir_qr = point.dir(q,r);
		vector cp = dir_pq.cross_product(dir_pq,dir_qr);
		return cp.magnitude()/2;
	}

}


class ram{
	public static void main(String[] args) {
		vector a,b;
		a = new vector(2,3,1);
		// b = new vector(4,3,12);
		// float r = a.dot(b);
		// r = (float)a.magnitude();
		// (new vector(r,0,0)).print();
		// // b = a.cross_product(a,b);
		// b.print();
		// b.divide(2);
		// b.print();
		// b.unit();
		// b.print();

		point e,r,t,y;
		vector w;
		e = new point(3,4,5);
		r = new point(7,3,6);
		y = new point(6,2,3);
		// t = point.mid(e,r);
		// t.print();
		// w = a.direction(e,r);
		// w.print();
		float area = point.area(e,r,y);
		(new vector(area,0,0)).print();
	}
}