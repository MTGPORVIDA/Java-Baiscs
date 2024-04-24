// James Dizikes
// CS 1324 Fall 2019
// Maintained by D. Trytten 4/12/2020
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Project10 extends JPanel{
	/**
	 * 
	 */
		private static final long serialVersionUID = 1L;
	// Change these constants to adjust the size and title of the window.
		private static final int WIDTH = 640;
		private static final int HEIGHT = 480;
		private static final String WINDOW_TITLE = "The Cat";
		
		// Do not change the main method.
		public static void main(String[] args)
		{
			JPanel panel = new Project10();
			panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
			
			JFrame frame = new JFrame(WINDOW_TITLE);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			frame.add(panel);
			frame.pack();
		}
		
		// Add your drawing code to this method.
		public void paintComponent(Graphics g)
		{
			// Do not change these two lines.
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			
			// Replace the example below with your code.
			
			Rectangle2D.Double myRect = new Rectangle2D.Double();
			myRect.setRect(150, 120, WIDTH/2, HEIGHT/2);
			g2d.setColor(Color.BLACK);
			g2d.draw(myRect);
			g2d.fill(myRect);
			
			Polygon earOne = new Polygon(new int[] {150, 200, 250}, new int[] {120, 50, 120}, 3);
			g2d.setColor(Color.BLACK);
			earOne.addPoint(210, 120);
			g2d.draw(earOne);
			g2d.setColor(Color.BLACK);
			g2d.fillPolygon(earOne);
			
			Polygon earTwo = new Polygon(new int[] {370, 420, 470}, new int[] {120, 50, 120}, 3);
			g2d.setColor(Color.BLACK);
			earTwo.addPoint(300, 120);
			g2d.draw(earTwo);
			g2d.setColor(Color.BLACK);
			g2d.fillPolygon(earTwo);
			
			RoundRectangle2D.Double chin = new RoundRectangle2D.Double();
			g2d.setColor(Color.BLACK);
			chin.setRoundRect(150, 200, WIDTH/2, HEIGHT/2 + 20, 150, 200);
			g2d.draw(chin);
			g2d.fill(chin);
			
			Arc2D.Double eye1 = new Arc2D.Double();
			g2d.setColor(Color.WHITE);
			eye1.setArc(200, 210, 50, 30, 360, 360, 0);
			g2d.draw(eye1);
			g2d.fill(eye1);
			
			Arc2D.Double eyeRetOne = new Arc2D.Double();
			g2d.setColor(Color.BLUE);
			eyeRetOne.setArc(210, 210, 30, 30, 360, 360, 0);
			g2d.draw(eyeRetOne);
			g2d.fill(eyeRetOne);
			
			Arc2D.Double eyePupilOne = new Arc2D.Double();
			g2d.setColor(Color.BLACK);
			eyePupilOne.setArc(220, 220, 10, 10, 360, 360, 0);
			g2d.draw(eyePupilOne);
			g2d.fill(eyePupilOne);
			
			Arc2D.Double eye2 = new Arc2D.Double();
			g2d.setColor(Color.WHITE);
			eye2.setArc(370, 210, 50, 30, 360, 360, 0);
			g2d.draw(eye2);
			g2d.fill(eye2);
			
			Arc2D.Double eyeRetTwo = new Arc2D.Double();
			g2d.setColor(Color.GREEN);
			eyeRetTwo.setArc(380, 210, 30, 30, 360, 360, 0);
			g2d.draw(eyeRetTwo);
			g2d.fill(eyeRetTwo);
			
			Arc2D.Double eyePupilTwo = new Arc2D.Double();
			g2d.setColor(Color.BLACK);
			eyePupilTwo.setArc(390, 220, 10, 10, 360, 360, 0);
			g2d.draw(eyePupilTwo);
			g2d.fill(eyePupilTwo);
			
			Polygon nose = new Polygon(new int[] {295, 310, 325}, new int[] {350, 380, 350}, 3);
			g2d.setColor(Color.PINK);
			g2d.draw(nose);
			g2d.fill(nose);
		}
}
