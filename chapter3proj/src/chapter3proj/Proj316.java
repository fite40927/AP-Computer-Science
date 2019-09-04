package chapter3proj;

import java.applet.Applet;
import java.awt.*;

public class Proj316 extends Applet {
	public void paint(Graphics page) {
		int stairs = 10, width = 50, mxheight = 300, position = 0, y;
		
		setBackground(Color.black);
		
		for(int height = 0; height <= 300; height += 50) {
			page.setColor(Color.white);
			page.fillRect(position, mxheight-height, width, height);
			position += width;
		}
	}
}