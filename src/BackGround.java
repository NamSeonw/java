

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class BackGround {
   private int x;
   private int y;
   private Image img;
   Toolkit tk = Toolkit.getDefaultToolkit();

   public BackGround() {
      x = 0;
      y = 0;
      img = tk.getImage("res/backgroundMap.png");
   }

   public void draw(Graphics g, GameCanvas gamecanvas) {
      g.drawImage(img, x, y, x+834, y+824, x, y, x+4000, y+3908, gamecanvas);
   }

}