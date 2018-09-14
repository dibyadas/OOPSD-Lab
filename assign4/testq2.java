import java.io.*;


class Stack{
	char[] stack_arr;
	int index;
	public Stack(int len){
		index = 0;
		stack_arr = new char[len];
	}

	public Stack() {}

	public void push(char ch){
		// System.out.println(index);
		stack_arr[index++] = ch;
		// System.out.println(ch);
	}
	
	public char pop(){
		// System.out.println(index);
		char temp = stack_arr[--index];
		stack_arr[index] = '\0';
		return temp;
	}

	// public boolean charThere(char ch){
	// 	if(ch == stack_arr[index-1]]){
	// 		return True;
	// 	}
	// 	return False;
	// }

	// public void check(){

	// }

}

class test2 {
	public static void main(String[] args) throws Exception {
		DataInputStream o = new DataInputStream(System.in);
		String a;
		char[] ach,b;
		a = o.readLine();
		ach = a.toCharArray();
		b = new char[a.length()];
		int j = 0;
		for(int i=a.length()-1; j< a.length(); j++){
			b[j] = a.charAt(i);
			i--;
		}

		for(int i=0; i< a.length(); i++){
			System.out.println(b[i]);
		}
		// System.out.println("maxtillnow");

		int maxtillnow = 0;
		int maxindex = 0;

		for(int i=0;i<a.length();i++){
			for(j=0; j<a.length();j++){
				if(ach[i] == b[j]){
					System.out.println(ach[i]);
					System.out.println(b[j]);
					maxtillnow = check(ach,b,i,a.length(),j,a.length());
				}
			}
		}

		System.out.println(maxtillnow);


	}

	public static int check(char[] a, char[] b, int afrom, int ato, int bfrom, int bto){
		int max = 0;
		for(int i=afrom;i<ato;){
			for(int j=bfrom; j<bto;){
				if(a[i] == b[j]){
					i++;j++;
					max++;
				}
				else{
					return max;
				}
			}
		}
		return max;
	}


}