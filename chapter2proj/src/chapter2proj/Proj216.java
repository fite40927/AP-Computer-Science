package chapter2proj;

import java.applet.Applet;
import java.awt.*;

public class Proj216 extends Applet {
	public void paint (Graphics page) {
		
		page.setColor(new Color(255, 188, 66));
		page.fillOval(22, 80, 40, 60);
		page.fillOval(168, 80, 40, 60);
		
		page.setColor(Color.yellow);
		page.fillOval(40, 40, 150, 150);
		
		page.setColor(new Color(117, 54, 17));
		page.fillOval(75, 90, 25, 25);
		page.fillOval(135, 90, 25, 25);
		
		page.setColor(Color.black);
		
		page.fillOval(82, 97, 12, 12);
		page.fillOval(142, 97, 12, 12);
		
		page.drawArc(95, 140, 50, 20, 190, 160);
		
		page.setColor(new Color(255, 188, 66));
		page.fillOval(106, 115, 25, 25);
		
	}
}