import java.io.*;
import java.lang.*;

class Stack{
	protected String s[] = new String[100];
	int sp = 1;
	
	public String take(){
		this.sp--;
		return this.s[this.sp];
	}

	public void put(String e){
		this.s[this.sp++] = e;
	}

	public String top(){
		return this.s[this.sp - 1];
	}

	private void print(int i){
		System.out.println(this.s[i]);
	}

	public void pt(){
		for(int i = 1; i < this.sp; i++){
			this.print(i);
		}
	}
}

class kapil{
	public static void main(String[] args) throws Exception {
		String a = " ", b;
		int i;
		// Stack x = new Stack();
		// Queue x = new Queue();
		PriorityQueue x = new PriorityQueue();
		DataInputStream k = new DataInputStream(System.in);
		do {
			a = k.readLine();
			i = a.indexOf(' ');
			if(i != -1){
				b = a.substring(0,i);
			} else {
				b = a;
			}
			if(b.compareTo("put") == 0)
				x.put(a.substring(i+1));

			if(b.compareTo("take") == 0)
				System.out.println("The taken element "+ x.take());

			if(b.compareTo("top") == 0)
				System.out.println("The first element "+ x.top());

			if(b.compareTo("print") == 0) { 
				x.pt();
				System.out.println();
			}
		}while(b.compareTo("exit")!=0);
	}
}


class Queue extends Stack{
	public void put(String e){
		for(int i = this.sp; i > 1; i--){
			s[i] = s[i-1];
		}
		s[1] = e;
		this.sp++; 
	}
}

class PriorityQueue extends Stack {
	public String take(){
		int largest = -99;
		int index = -9;
		for(int i = 0; i < s.length; i++){
			
			if(s[i] != null){

				if(Integer.parseInt(s[i]) > largest) {
					largest = Integer.parseInt(s[i]);
					index = i;
				} 
			}

		}
		if(index >= 0){
			s[index] = "-99";
		}
		sp--;
		return Integer.toString(largest);
	} 

	public String top(){
		int largest = -99;
		for(int i = 0; i < s.length; i++){
			if(s[i] != null){ 
				if(Integer.parseInt(s[i]) > largest) {
					largest = Integer.parseInt(s[i]);
				} 
			}
		}
		return Integer.toString(largest);
	};
} 