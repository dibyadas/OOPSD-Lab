#include <iostream>

using namespace std;

class b{
	public:
		void f(){
			cout<<"gyan";
		}

		void h(){
			cout<<"hari";
		}
};


class c{
	public:
		void f(){
			cout<<"mohan";
		}
};

class t : public b, public c{
	public:
		void h(){
			cout<<"anil";
		}
};


main() {
	t x;
	b y;
	x.c::f();
	x.h();
	x.b::h();
	y.h();
}
