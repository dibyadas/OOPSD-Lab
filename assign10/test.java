import java.awt.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;
import java.applet.*;
import java.util.*;

public class gr extends Applet{
	int x = 70;
	String a = "";
	public void init(){
		setBackground(Color.white);
		setForeground(Color.red);
	}

	public void paint(Graphics g){
		int x,y,z;
		x = 0; y = 0; z = 0;
		do{
			Scanner sc = new Scanner(System.in);
			String inp = sc.next();
			if(inp.compareTo("square") == 0){
				x = sc.nextInt();
				g.drawRect(100-(x/2),100-(x/2),x,x);
			}
			if(inp.compareTo("rectangle") == 0){
				x = sc.nextInt();
				y = sc.nextInt();
				g.drawRect(100,100,x,y);
			}
			if(inp.compareTo("circle") == 0){
				x = sc.nextInt();
				y = sc.nextInt();
				z = sc.nextInt();
				g.drawOval(100-(x/2),100-(y/2),z,z);
			}
		} while(true);

	}
}

