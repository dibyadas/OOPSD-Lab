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
	// public void paint(Graphics g){
	// 	g.drawRect(10,100,50,70);
	// 	g.fillOval(10,100,50,70);
	// 	g.drawString("Kapil", x, 7);
	// 	g.drawLine(100,20,400,70);
	// 	g.setColor(Color.blue);
	// 	g.drawOval(100,200,50,10);
	// }

	// public void paint(Graphics g){
	// 	do{
	// 		try{
	// 			DataInputStream o = new DataInputStream(System.in);
	// 			a = o.readLine();
	// 		} catch (Exception t){
	// 			System.out.println(t);
	// 		}

	// 		x = Integer.parseInt(a);
	// 		g.drawLine(x,100,x+50,200);
	// 	} while(true);
	// }

	// public void paint(Graphics g){
	// 	do{
	// 		try{
	// 			DataInputStream o = new DataInputStream(System.in);
	// 			a = o.readLine();
	// 		} catch (Exception t){
	// 			System.out.println("t");
	// 		}
	// 		try{
	// 			x = Integer.parseInt(a);
	// 			g.drawRect(200,200,x,x);	
	// 		} catch (Exception t){
	// 			System.out.println("Enter valid number");
	// 		}
	// 	} while(true);
	// }

	// public void paint(Graphics g){
	// 	do{
	// 		try{
	// 			DataInputStream o = new DataInputStream(System.in);
	// 			a = o.readLine();
	// 		} catch (Exception t){
	// 			System.out.println("t");
	// 		}
	// 		try{
	// 			x = Integer.parseInt(a);
	// 			g.drawRect(200-x,200-x,x,x);	
	// 		} catch (Exception t){
	// 			System.out.println("Enter valid number");
	// 		}
	// 	} while(true);
	// }

	// public void paint(Graphics g){
	// 	do{
	// 		try{
	// 			DataInputStream o = new DataInputStream(System.in);
	// 			a = o.readLine();
	// 		} catch (Exception t){
	// 			System.out.println("Error occured");
	// 		}
	// 		try{
	// 			x = Integer.parseInt(a);
	// 			g.drawRect(200-(x/2),200-(x/2),x,x);	
	// 		} catch (Exception t){
	// 			System.out.println("Enter valid number");
	// 		}
	// 	} while(true);
	// }

	// public void paint(Graphics g){
	// 	int x,y;
	// 	x = 0; y = 0;
	// 	do{
	// 		try{
	// 			Scanner sc = new Scanner(System.in); 
	// 			x = sc.nextInt();
	// 			y = sc.nextInt();
	// 		} catch (Exception t){
	// 			System.out.println("Error occured");
	// 		}
	// 		try{
	// 			g.drawRect(x,y,100,100);
	// 		} catch (Exception t){
	// 			System.out.println("Enter valid number");
	// 		}
	// 	} while(true);
	// }

	// public void paint(Graphics g){
	// 	int x,y,z;
	// 	x = 0; y = 0; z = 0;
	// 	do{
	// 		Scanner sc = new Scanner(System.in);
	// 		String inp = sc.next();
	// 		if(inp.compareTo("square") == 0){
	// 			x = sc.nextInt();
	// 			g.drawRect(100-(x/2),100-(x/2),x,x);
	// 		}
	// 		if(inp.compareTo("rectangle") == 0){
	// 			x = sc.nextInt();
	// 			y = sc.nextInt();
	// 			g.drawRect(100,100,x,y);
	// 		}
	// 		if(inp.compareTo("circle") == 0){
	// 			x = sc.nextInt();
	// 			y = sc.nextInt();
	// 			z = sc.nextInt();
	// 			g.drawOval(100-(x/2),100-(y/2),z,z);
	// 		}
			
	// 	} while(true);
	// }

	// public void paint(Graphics g){
	// 	int x,y,z;
	// 	x = 0; y = 0; z = 0;
	// 	do{
	// 		Scanner sc = new Scanner(System.in);
	// 		String inp = sc.next();
	// 		if(inp.compareTo("ram") == 0){
	// 			g.setColor(Color.red);
	// 			g.drawOval(80,80,40,40);
	// 		}
	// 		if(inp.compareTo("gagan") == 0){
	// 			g.setColor(Color.green);
	// 			g.drawOval(80,80,40,40);
	// 		}
	// 		if(inp.compareTo("bimu") == 0){
	// 			g.setColor(Color.blue);
	// 			g.drawOval(80,80,40,40);
	// 		}
	// 	} while(true);
	// }

	// public void paint(Graphics g){
	// 	int x,y,z;
	// 	x = 0; y = 0; z = 0;
	// 	int r = 40;
	// 	do{
	// 		Scanner sc = new Scanner(System.in);
	// 		String inp = sc.next();
	// 		if(inp.compareTo("ram") == 0){
	// 			g.setColor(Color.red);
	// 			g.drawOval(100-(r/2),100-(r/2),r,r);
	// 			r += 5;
	// 		}
	// 		if(inp.compareTo("gagan") == 0){
	// 			g.setColor(Color.green);
	// 			g.drawOval(100-(r/2),100-(r/2),r,r);
	// 			r += 5;
	// 		}
	// 		if(inp.compareTo("bimu") == 0){
	// 			g.setColor(Color.blue);
	// 			g.drawOval(100-(r/2),100-(r/2),r,r);
	// 			r += 5;
	// 		}
	// 		if(inp.compareTo("break") == 0){
	// 			break;
	// 		}
	// 	} while(true);
	// 	repaint();
	// }

	public void drawSquare(int angle, int x, int y, int side, Graphics g){
		if(angle == 90){
			// System.out.println("This");
			// System.out.println(x-(side/2));
			// System.out.println(y-(side/2));
			// System.out.println("Thise");
			g.drawRect(x-(side/2),y-(side/2),side,side);
		}
		if(angle == 45){
			int cx = (int)(x);
			int cy = (int)(y);
			
			int hyp = (int)(Math.sqrt(2)*side);
			System.out.println(hyp);
			int a1 = cx; int b1 = cy - side/2;
			int a2 = cx + side/2; int b2 = cy;
			int a3 = cx; int b3 = cy + side/2;
			int a4 = cx - side/2; int b4 = cy;
			g.drawLine(a1,b1,a2,b2);
			g.drawLine(a2,b2,a3,b3);
			g.drawLine(a3,b3,a4,b4);
			g.drawLine(a1,b1,a4,b4);

		}
	}

	public void paint(Graphics g){
		int x,y,z;
		x = 0; y = 0; z = 0;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		int flag = 90;
		
		int new_side = x;
		int c = 0;
		while(new_side > y){
			drawSquare(flag,350,150,new_side,g);
			g.drawOval(350-(new_side/2),150-(new_side/2),new_side,new_side);
			if( flag == 90){
				flag = 45;
				new_side = (int)(new_side/Math.sqrt(2));

			} else if( flag == 45) {
				flag = 90;
			}
			c++;
		}
		System.out.println("Total number of squares = "+c);
	}

}