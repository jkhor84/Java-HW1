import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawCalculator extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);
		g.drawRect(100,100,310,420);
		
		g.drawRect(120,300,40,40);
		g.drawRect(170,300,40,40);
		g.drawRect(220,300,40,40);
		g.drawRect(280,300,50,40);
		g.drawRect(340,300,50,40);
		
		g.drawRect(120,350,40,40);
		g.drawRect(170,350,40,40);
		g.drawRect(220,350,40,40);
		g.drawRect(280,350,50,40);
		g.drawRect(340,350,50,40);
		
		g.drawRect(120,400,40,40);
		g.drawRect(170,400,40,40);
		g.drawRect(220,400,40,40);
		g.drawRect(280,400,50,40);
		g.drawRect(340,400,50,40);
		
		g.drawRect(170,450,40,40);
		g.drawRect(280,450,50,40);
		g.drawRect(340,450,50,40);
		
		g.setColor(Color.CYAN);
		g.fillRect(120,170,260,90);
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("TimesRoman", Font.PLAIN, 50)); 
		g.drawString("Calculator",140,150);
		
		g.setFont(new Font("Robinson Typeface", Font.PLAIN, 30)); 
		g.drawString("7",130,330);
		g.setFont(new Font("Robinson Typeface", Font.PLAIN, 30)); 
		g.drawString("8",180,330);
		g.setFont(new Font("Robinson Typeface", Font.PLAIN, 30)); 
		g.drawString("9",230,330);
		g.setFont(new Font("Robinson Typeface", Font.PLAIN, 20)); 
		g.drawString("DEL",287,330);
		g.setFont(new Font("Robinson Typeface", Font.PLAIN, 20)); 
		g.drawString("AC",350,330);
		
		g.setFont(new Font("Robinson Typeface", Font.PLAIN, 30)); 
		g.drawString("4",130,380);
		g.setFont(new Font("Robinson Typeface", Font.PLAIN, 30)); 
		g.drawString("5",180,380);
		g.setFont(new Font("Robinson Typeface", Font.PLAIN, 30)); 
		g.drawString("6",230,380);
	 	g.setFont(new Font("Robinson Typeface", Font.PLAIN, 35)); 
		g.drawString("*",298,390);
		g.setFont(new Font("Robinson Typeface", Font.PLAIN, 35)); 
		g.drawString("/",360,385);
		
		g.setFont(new Font("Robinson Typeface", Font.PLAIN, 30)); 
		g.drawString("1",130,430);
		g.setFont(new Font("Robinson Typeface", Font.PLAIN, 30)); 
		g.drawString("2",180,430);
		g.setFont(new Font("Robinson Typeface", Font.PLAIN, 30)); 
		g.drawString("3",230,430);
		g.setFont(new Font("Robinson Typeface", Font.PLAIN, 35)); 
		g.drawString("+",295,433);
		g.setFont(new Font("Robinson Typeface", Font.PLAIN, 35)); 
		g.drawString("-",360,430);
		
		g.setFont(new Font("Robinson Typeface", Font.PLAIN, 30)); 
		g.drawString("0",180,480);
		g.setFont(new Font("Robinson Typeface", Font.PLAIN, 20)); 
		g.drawString("ANS",285,480);
		g.setFont(new Font("Robinson Typeface", Font.PLAIN, 35)); 
		g.drawString("=",355,483);
		
	}
	public static void main(String[] args) 
	{
		DrawCalculator t = new DrawCalculator();
		
		JFrame jf = new JFrame();
		
		jf.setTitle("Calculator");
		jf.setSize(600,900);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(t);
	}

}