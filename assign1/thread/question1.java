import java.io.*;

class question1{
	public static void main(String[] args) throws Exception {
		int index = 0;
		DataInputStream stream = new DataInputStream(System.in);
		String k1;
		char flag = '\0';
		k1 = stream.readLine().trim();
		char ch[] = k1.toCharArray();
		try{
			int i = 0;
			while(true){
				if(ch[i] == '+' || ch[i] == '-' || ch[i] == '*' || ch[i] == '/' ){
					index = i;
					flag = ch[i];
					break;
				}
				i++;
			}
		}
		catch (Exception e){
		}
		int a = Integer.parseInt(k1.substring(0,index));
		int b = Integer.parseInt(k1.substring(index+1,k1.length()));
		switch(flag){
			case '+':
				System.out.println(a+b);
				break;
			case '-':
				System.out.println(a-b);
				break;
			case '*':
				System.out.println(a*b);
				break;
			case '/':
				System.out.println(a/b);
				break;
			default:
		}
		
	}
}