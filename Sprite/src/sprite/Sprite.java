package sprite;

import java.awt.Color;
import java.awt.Graphics;

public class Sprite {

	// Variables (package access)
	   int x, y, radius; // rectangle (for illustration)
	   Color color = Color.RED; // color of the object
	 
	   /** Constructor to setup the GUI */
	   public Sprite(int x, int y, int radius, Color color) {
	      this.x = x;
	      this.y = y;
	      this.radius = radius;
	      this.color = color;
	   }
	 
	   /** Paint itself (given the Graphics context) */
	   public void paint(Graphics g) {
	      g.setColor(color);
	      g.fillOval(x, y, radius*2, radius*2); // fill a rectangle
	   }
}
