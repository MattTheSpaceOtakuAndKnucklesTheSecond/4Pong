package bouncingball;

import javax.swing.*;

import java.awt.*;
import java.awt.Graphics;


public class Ball extends JPanel {
	
	//public BallGame() {
		
		
	//}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.fillOval(15, 15, 25, 25);
		
		
	}

}
