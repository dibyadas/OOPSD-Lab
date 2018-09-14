import java.io.*;
import java.lang.*;

class test1 {
	public static void main(String[] args) throws Exception {
		DataInputStream o = new DataInputStream(System.in);
		String a = o.readLine();
		int c = Integer.parseInt(a);

		int loop = (int)Math.pow(2,c) - 1;
		for(int i=0; i <= loop; i++){
			int b[] = convert_to_binary(i,c);
			mapping(b, c);
		}
	}	

	public static void mapping(int[] b, int c){
		int[] arr = new int[c];
		for(int i = 0; i < c; i++){
			arr[i] = i+1;
		}

		System.out.print("{");
		for(int i = 0; i < c; i++ ){
			if(b[i] == 1){
				System.out.print(arr[i]);
				System.out.print(",");
			}
		}
		System.out.println("}");
	}	

	public static int[] convert_to_binary(int num, int loop) {
		int u[] = new int[loop];
		int i = 0;
		while(num != 0){
			u[i] = num % 2;
			num = num/2;
			i++;
		}
		return u;
	}
}