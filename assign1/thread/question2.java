import java.io.*;

class question2{
	public static void main(String[] args) throws Exception {
		int index = 0;
		DataInputStream stream = new DataInputStream(System.in);
		String k1;
		k1 = stream.readLine().trim();
		char ch[] = new char[100];
		for(int i=k1.length()-1,j=0; i >= 0 ; i--,j++ ){
			ch[j] = k1.charAt(i);
		}	
		String reversed = new String(ch);
		reversed = reversed.trim();
		if(k1.compareTo(reversed) == 0){
			System.out.println("YES");
		} else {
			System.out.println(reversed);
			System.out.println("NO");
		}
	}
}