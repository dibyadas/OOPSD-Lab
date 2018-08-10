import java.io.*;
import java.lang.*;

class point{
	float x,y;
	public point(float a, float b){
		x = a;
		y = b;
	}

	public void print(){
		System.out.println("("+x+" , "+y+")");
	}

	public static point mid(point a, point b){
		return new point((a.x+b.x)/2,(a.y+b.y)/2);
	}

	// public static vector dir(point a, point b) {
	// 	return new vector(b.x-a.x,b.y-a.y,b.z-a.z);
	// }

	// public static float area(point p, point q, point r){
	// 	vector dir_pq = point.dir(p,q);
	// 	vector dir_qr = point.dir(q,r);
	// 	vector cp = dir_pq.cross_product(dir_pq,dir_qr);
	// 	return cp.magnitude()/2;
	// }

}

class line{
	float a,b,c;

	public line(float p, float q, float r){
		a = p;
		b = q;
		c = r;
	}

	public line(){}

	public void print(){
		Syste,
	}

	public void eq(point x, point y){
		co_y = (y.x - x.x);
		co_x = (x.y - y.y);
		co_c = (y.y - x.y)*x.x - (y.x - x.x)*x.y;
		return new line(co_x,co_y,co_c);
	} 

}