import java.io.*;

class fifteen
{
	public static void main(String args[]) throws Exception {
		DataInputStream stream = new DataInputStream(System.in);
		String k1;
		k1 = stream.readLine();
		char ch[] = k1.toCharArray();
		int counter = 0;
		try{
			int i = 0;
			while(true){
				if( (int) ch[i] >= 65 && (int) ch[i] <= 90){
					counter++;
				}
				i++;
			}
		}
		catch (Exception e){
			return;
		}
		finally {
			System.out.println(counter);	
		}
		
	}
	
}