class xyz{
	float a,b;

	public xyz(){}

	public xyz(float a, float b){
		this.a = a;
		this.b = b;
	}

	public void pt(){
		System.out.println("("+a+","+b+")");
	}

	public xyz f(){
		float ta,tb;
		ta = a;
		tb = b;
		a = ta + tb;
		b = ta;
		return this;
		// return new xyz(10*a,15*b);
	}

	public xyz g(){
		b = 2*b;
		// return new xyz(5*a,5*b);
		return this;
	}

	public static xyz h(xyz x){
		return new xyz(10*(x.a)+1,15*(x.b)+1);
	}

}


class hari{
	public static void main(String[] args) {


		xyz a,b;
		a = new xyz(2,3);
		a.pt();
		b = xyz.h(a.f().g());
		a.pt();
		b.pt();
	}
}



