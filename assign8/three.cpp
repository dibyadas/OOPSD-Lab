// multiple objects
#include<iostream>

using namespace std;

class ravi{
	public:
		int y,z;
};

class anil{
	public:
		int x;
		ravi operator+(){
			ravi p;
			p.y = x + 7;
			p.z = x*2;
			return p;
		}
};

// void k(anil a, ravi b){
// 	int p = a.x + b.y;
// 	cout<<p*b.z<<endl;
// }

// ravi operator+(anil a){
// 	ravi p;
// 	p.y = a.x + 7;
// 	p.z = a.x*2;
// 	return p;
// }

main(){
	anil u;
	ravi v;
	u.x = 5;
	v = +u;
	cout<<v.y<<","<<v.z<<endl;
}

// main(){
// 	anil u;
// 	ravi v;
// 	u.x = 5;
// 	v.y = 3;
// 	v.z = 9;
// 	k(u,v);
// }

