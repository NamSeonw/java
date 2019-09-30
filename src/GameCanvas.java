
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameCanvas extends Canvas {
	BackGround bg;
	Princess pc;

	public GameCanvas() {
		pc = new Princess();
		bg = new BackGround();
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				System.out.println(e.getX() + ", " + e.getY());
			}
		});

		new Thread(() -> {
			while (true) {
				try {
					pc.move();
					Thread.sleep(16); // 약 60프레임
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				repaint();
			}
		}).start();

	}

	@Override
	public void update(Graphics g) {
		// TODO Auto-generated method stub
		this.paint(g);
	}

	@Override
	public void paint(Graphics g) {

		Image bufImage = createImage(getWidth(), getHeight());
		Graphics bufGraphic = bufImage.getGraphics();

		bg.draw(bufGraphic,this);
		pc.draw(bufGraphic,this);

		g.drawImage(bufImage, 0, 0, this);
		
	}
}