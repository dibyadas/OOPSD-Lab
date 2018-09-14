#include<iostream>

using namespace std;

class anil{
	public:
		int x;
		// void g(anil m){
			// cout<<x*100+m.x<<endl;
		// }
		void operator +=(anil m){
			cout<<x*100+m.x<<endl;
		}
	
};

main(){
	anil u,v;
	u.x = 5;
	v.x = 3;
	// u.g(v);
	u += v;
	v += u;
}