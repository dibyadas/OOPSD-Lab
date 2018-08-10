import java.io.*;

class twelve
{
	public static void main(String args[]) throws Exception {
		DataInputStream stream = new DataInputStream(System.in);
		String k1;
		k1 = stream.readLine();
		int a[] = {0,0};
		int j = 0;
		for(int i=0; i < k1.length(); i++){
			if(k1.charAt(i) == ' '){
				a[j] = i;
				j++;
			}
		}
		int x = Integer.parseInt(k1.substring(0,a[0]));
		int y = Integer.parseInt(k1.substring(a[0]+1,a[1]));
		int z = Integer.parseInt(k1.substring(a[1]+1,k1.length()));
		System.out.println(x+y+z);
	}
	
}