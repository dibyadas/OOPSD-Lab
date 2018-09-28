import java.io.*;
import java.lang.*;
import java.util.Stack;
import java.util.*;

class kapil{
	public static void main(String[] args) throws Exception {
		Stack<String> s = new Stack<String>();
		Stack<String> t = new Stack<String>();
		DataInputStream u = new DataInputStream(System.in);
		String a,b,c;char p,q;
		int i,j,size=0;
		do{
			a = u.readLine();
			p = a.charAt(0);
			if(p == 'A'){
				b = a.substring(1);
				s.push(b);
				size++;
			}
			if(p == 'B'){
				s.pop();
				size--;
			}
			if(p == 'C'){
				b = s.pop();
				System.out.println(b);
				s.push(b);
			}
			if(p == 'D'){
				for (i = 1; i <= size; i++) {
					b = s.pop();
					t.push(b);
				}
				for (i = 1; i <= size; i++) {
					b = t.pop();
					System.out.print(b + ",");
					s.push(b);
				}
				System.out.println();
			}
			if(p == 'E'){
				q = a.charAt(1);
				c = a.substring(2);
				j = (int) q - 48;
				j = size + 2-j;
				size++;
				for(i=1;i<j;i++)
				{
					b = s.pop();
					t.push(b);
				}
				s.push(c);
				for(i=1;i<j;i++)
				{
				b = t.pop();
				s.push(b);
				}
			}
			if(p == 'F'){
				for (i = 1; i <= size; i++) {
					b = s.pop();
					System.out.print(b + ",");
					t.push(b);
				}
				for (i = 1; i <= size; i++) {
					b = t.pop();
					s.push(b);
				}
				System.out.println();
			}
			if(p == 'G'){
				for (i = 1; i <= size; i++) {
					b = s.pop();
					t.push(b);
				}
				b = t.pop();
				s.push(b);
				System.out.print(b);
				System.out.println();
				for (i = 2; i <= size; i++) {
					b = t.pop();
					s.push(b);
				}
			}

			if(p == 'H'){
				int till;
				b = a.substring(1,a.length());
				till = Integer.parseInt(b);
				for (i = 1; i <= size; i++) {
					b = s.pop();
					t.push(b);
				}

				try{
					for (i = 1; i < till; i++) {
						b = t.pop();
						s.push(b);
					}

					b = t.pop();
					s.push(b);
					System.out.print(b);

					for (i = till+1; i <= size; i++) {
						b = t.pop();
						s.push(b);
					}	
				} catch (EmptyStackException e){
					System.out.println("Invalid Index Entered!");
				}
				System.out.println();
			}

			if(p == 'I'){
				String temp = a.substring(1,a.length());
				for (i = 1; i <= size; i++) {
					b = s.pop();
					t.push(b);
				}
				t.push(temp);
				size++;
				for (i = 1; i <= size; i++) {
					b = t.pop();
					s.push(b);
				}
			}

			if(p == 'J'){
				size--;
				for (i = 1; i <= size; i++) {
					b = s.pop();
					t.push(b);
				}
				s = new Stack<String>();
				for (i = 1; i <= size; i++) {
					b = t.pop();
					s.push(b);
				}
			}

			if(p == 'K'){
				String max;
				max = s.pop();
				t.push(max);
				for (i = 2; i <= size; i++) {
					b = s.pop();
					max = (b.compareTo(max) >= 0) ? b : max;
					t.push(b);
				}

				for (i = 1; i <= size; i++) {
					b = t.pop();
					s.push(b);
				}
				
				System.out.println(max);

			}

			if(p == 'L'){
				String max;
				max = s.pop();
				t.push(max);
				for (i = 2; i <= size; i++) {
					b = s.pop();
					max = (b.compareTo(max) >= 0) ? b : max;
					t.push(b);
				}

				for (i = 1; i <= size; i++) {
					b = t.pop();
					if(max.compareTo(b) == 0) continue;
					s.push(b);
				}
				size--;
			}

			

			if( p == 'S'){
				break;
			}
		}while(true);

	}

}
