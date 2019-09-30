import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Princess {
	private int x;
	private int y;
	Image img;

	public Princess() {
		x = 45;
		y = 580;
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("res/princess.png");
	}

	public void wakeUp() {
	}

	public void move() {
		x += 50;
		
	}

	public void draw(Graphics g, GameCanvas gamecanvas) {
		g.drawImage(img, x , y, x+215, y+270, 50, 10, 686, 389, gamecanvas);
	}

}
