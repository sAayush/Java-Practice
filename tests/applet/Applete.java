package tests.applet;

import java.applet.*;
import java.awt.*;

public class Applete extends Applet {
	public void paint(Graphics g) {
		g.drawString("Hello World", 25, 50);
	}
}
/*
 * <applet code = Applete.class height=100 width=200></applet>
 */