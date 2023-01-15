package main;
import java.awt.*;

public class Food{

	Point p;
	static final int u = GamePanel.UNIT_SIZE;
	
	public Food(Point p){
		this.p = p;
	}

	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(p.x, p.y, u, u);
	}

}